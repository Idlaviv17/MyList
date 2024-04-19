package angulo.javier.mylist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class BookAdapter(val books_list: List<Book>): RecyclerView.Adapter<BookAdapter.BookViewHolder>() {

    class BookViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var image: ImageView = itemView.findViewById(R.id.book_image)
        var title: TextView = itemView.findViewById(R.id.book_title)
        var desc: TextView = itemView.findViewById(R.id.book_description)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return BookViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return books_list.size
    }

    override fun onBindViewHolder(holder: BookViewHolder, position: Int) {
        val book: Book = books_list[position]
        holder.image.setImageResource(book.image)
        holder.title.text = book.title
        holder.desc.text = book.desc
    }
}