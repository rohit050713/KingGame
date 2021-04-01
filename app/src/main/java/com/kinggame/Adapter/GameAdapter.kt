package com.kinggame.Adapter

import android.content.Context
import android.content.Intent
import android.opengl.Visibility
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.kinggame.Activities.SecondScreenActivity
import com.kinggame.Model.GameModel
import com.kinggame.R
import de.hdodenhof.circleimageview.CircleImageView

class GameAdapter(var context: Context,var arrayList: ArrayList<GameModel>) : RecyclerView.Adapter<GameAdapter.ViewHolder>() {

    public val LEVEL_TYPE_RIGHT : Int=0
    public val LEVEL_TYPE_LEFT : Int=1
    public val LEVEL_TYPE_BOSS : Int=2

    public class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var levelName : TextView = itemView.findViewById(R.id.tvLevelName)
        var levelImage : CircleImageView= itemView.findViewById(R.id.cvLevelImage)
        var lock : CircleImageView= itemView.findViewById(R.id.cvLevelLock)
        var numberOfCoins : TextView = itemView.findViewById(R.id.tvNumberofCoins)
        var stairs : ImageView = itemView.findViewById(R.id.ivStairs)





    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        if(viewType.equals(LEVEL_TYPE_LEFT)) {
            var view = LayoutInflater.from(parent.context)
                .inflate(R.layout.rv_item_game_left, parent, false)
            return ViewHolder(view)
        }
        else if(viewType.equals(LEVEL_TYPE_RIGHT)){
            var view = LayoutInflater.from(parent.context)
                .inflate(R.layout.rv_item_game_right, parent, false)
            return ViewHolder(view)
        }
        else{
            var view : View = LayoutInflater.from(parent.context)
                .inflate(R.layout.rv_item_game_right, parent, false)
            return ViewHolder(view)
        }
    }

    override fun getItemCount(): Int {
       return arrayList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var model : GameModel = arrayList.get(position)

        holder.levelName.setText(model.getLevelName())
        Glide.with(context)
            .load(model.getImage())
            .into(holder.levelImage)

        if (model.getLevelNumber() == 16){
            holder.stairs.visibility= View.GONE

        }
        else{
            holder.stairs.visibility= View.VISIBLE

        }

        if(model.getLevelNumber() == 1){
            holder.lock.visibility = View.GONE
        }
        else{
            holder.lock.visibility= View.VISIBLE
        }

        holder.levelImage.setOnClickListener(){
            var intent= Intent(context,SecondScreenActivity::class.java)
            intent.putExtra("levelName",holder.levelName.text.toString())
            intent.putExtra("levelNumber",model.getLevelNumber())
            context.startActivity(intent)
        }






    }

    override fun getItemViewType(position: Int): Int {
        if(arrayList.get(position).getLevelNumber() == 16){
            return LEVEL_TYPE_BOSS
        }
        else if(arrayList.get(position).getLevelNumber()%2 == 0){
            return LEVEL_TYPE_RIGHT
        }
        else{
            return LEVEL_TYPE_LEFT
        }
    }

}