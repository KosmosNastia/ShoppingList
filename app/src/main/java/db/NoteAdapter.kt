package db

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewParent
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter

import androidx.recyclerview.widget.RecyclerView
import com.example.shoppinglist.R
import com.example.shoppinglist.databinding.NoteListItemBinding
import com.example.shoppinglist.entities.Noteitem

class NoteAdapter : ListAdapter<Noteitem, NoteAdapter.ItemHolder>(ItemComparator()){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
        return ItemHolder.create(parent)
    }

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {
       holder.setData(getItem(position))
    }


    class ItemHolder(view: View) : RecyclerView.ViewHolder(view){
        private val binding = NoteListItemBinding.bind(view)

        fun setData(note: Noteitem) = with(binding){
            tvTitle.text = note.title
            tvDescription.text = note.content
            tvTime.text = note.time
        }
        companion object{
            fun create(parent: ViewGroup): ItemHolder {
               return ItemHolder(
                   LayoutInflater.from(parent.context).
                   inflate(R.layout.note_list_item, parent, false))
            }
        }
    }

    class ItemComparator : DiffUtil.ItemCallback<Noteitem>() {
        override fun areItemsTheSame(oldItem: Noteitem, newItem: Noteitem): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: Noteitem, newItem: Noteitem): Boolean {
          return oldItem == newItem
        }
    }
}