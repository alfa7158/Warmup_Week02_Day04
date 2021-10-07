class book(var BookName:String, var author:String,
           var published:String, var Language:String, var page:Int ) {
    var map = mutableMapOf<Int,String>()





    fun add_bookmark(pNumer:Int,note:String){

        map.put(pNumer,note)


    }
    fun display_all_bookmarks():String{
        return("$map")
    }

    fun display_book_details():String{
        return("The book name: $BookName \n author name: $author \n published:, $Language: \n, page :$page ")

    }
}
fun main(){


         println("Enter the Book name:")
         var myBook = readLine()!!
         println("Enter the auth name:")
         var auth = readLine()!!
         println("Date of publish: ")
         var publish = readLine()!!
         println("Language: ")
         var Language = readLine()!!
         print("page number:")
         var page = readLine()!!.toInt()
         print("Note:")
         var theNote = readLine()!!
         var theBook = book(myBook,auth,publish,Language,page)
         theBook.add_bookmark(page,theNote)
         println(theBook.display_book_details())
         println(theBook.display_all_bookmarks())








}



