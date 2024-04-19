package angulo.javier.mylist

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val books = listOf(
            Book(R.drawable.dune, "Dune", "Dune is a 1965 epic science fiction novel by American author Frank Herbert, originally published as two separate serials in Analog magazine. It tied with Roger Zelazny's This Immortal for the Hugo Award for Best Novel and won the inaugural Nebula Award for Best Novel in 1966."),
            Book(R.drawable.fire_and_blood, "Fire & Blood", "Fire & Blood is a fantasy book by American writer George R. R. Martin and illustrated by Doug Wheatley. It tells the history of House Targaryen, the dynasty that ruled the Seven Kingdoms of Westeros in the backstory of his series A Song of Ice and Fire."),
            Book(R.drawable.the_subtle_art_of_not_giving_a_fck, "The Subtle Art of Not Giving a F*ck", "A Counterintuitive Approach to Living a Good Life is a 2016 nonfiction self-help book by American blogger and author Mark Manson."),
            Book(R.drawable.story_of_your_life, "Story of Your Life", "\"Story of Your Life\" is a science fiction novella by American writer Ted Chiang, first published in Starlight 2 in 1998, and in 2002 in Chiang's collection of short stories, Stories of Your Life and Others. Its major themes are language and determinism."),
            Book(R.drawable.to_kill_a_mockingbird, "To Kill a Mockingbird", "To Kill a Mockingbird is a novel by the American author Harper Lee. It was published in June 1960 and became instantly successful. In the United States, it is widely read in high schools and middle schools.")
        )

        val recycler_books: RecyclerView = findViewById(R.id.list_view)
        recycler_books.layoutManager = LinearLayoutManager(this)
        recycler_books.adapter = BookAdapter(books)
    }
}