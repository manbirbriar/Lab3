package ca.ucalgary.ensf380;

/*
 * MyBook.java
 * Lab3_ExD
 * Submission Date: July 18, 2024
 * @author Manbir Briar
 * @version 1.3
 */

public class MyBook {
    public static void main(String[] args) {
        // Create authors
        Author author1 = new Author("Daniel Craig", "14 Cap St", 37);
        Author author2 = new Author("Austin Rivers", "36 Dang Ave", 67);

        // Create publishers
        Publisher publisher1 = new Publisher("Scholastic Canada", "90 Fung Street");
        Publisher publisher2 = new Publisher("Leatherman", "23 Open Avenue");

        // Create classics
        Classic classic1 = new Classic();
        classic1.setIsbn("23859789");
        classic1.setPages(250);
        classic1.setOrigPubYear(1943);
        classic1.setTheAuthor(author1);
        classic1.setBookPublisher(new Publisher[]{publisher1});

        Classic classic2 = new Classic();
        classic2.setIsbn("342958");
        classic2.setPages(400);
        classic2.setOrigPubYear(1918);
        classic2.setTheAuthor(author2);
        classic2.setBookPublisher(new Publisher[]{publisher2});

        // Create stories
        Story story1 = new Story();
        story1.setTheAuthors(new Author[]{author1});
        
        Story story2 = new Story();
        story2.setTheAuthors(new Author[]{author2});

        // Create anthology
        Anthology anthology = new Anthology();
        anthology.setStories(new Story[]{story1, story2});
        anthology.setIsbn("345343453");
        anthology.setPages(350);

        // Create novel
        Novel novel = new Novel();
        novel.setIsbn("45673467");
        novel.setPages(500);
        novel.setTheAuthor(new Author[]{author1});
        novel.setMySeries(new Series());

        // Create nonfiction
        Nonfiction nonfiction = new Nonfiction();
        nonfiction.setIsbn("67568789");
        nonfiction.setPages(300);
        nonfiction.setDeweyClassification(new Category());

        // Create contract
        Contract contract = new Contract("2024-07-18", new Publisher[]{publisher1, publisher2}, new Author[]{author1, author2});

        publisher1.setClassicsCatalog(new Classic[]{classic1});
        publisher2.setClassicsCatalog(new Classic[]{classic2});
        Series series = new Series();
        series.setSeriesName("Captain Series");
        novel.setMySeries(series);

        
        // Print authors and their information
        System.out.println("Authors:");
        System.out.println("Name: " + author1.getName() + ", Address: " + author1.getAddress() + ", Age: " + author1.getAge());
        System.out.println("Name: " + author2.getName() + ", Address: " + author2.getAddress() + ", Age: " + author2.getAge());
        
        // Print publishers and their information
        System.out.println("\nPublishers:");
        System.out.println("Name: " + publisher1.getName() + ", Address: " + publisher1.getAddress());
        System.out.println("Name: " + publisher2.getName() + ", Address: " + publisher2.getAddress());

        
        System.out.println("\nBooks:");

        System.out.println("Classic 1:");
        System.out.println("ISBN: " + classic1.getIsbn() + ", Pages: " + classic1.getPages() + ", Original Publication Year: " + classic1.getOrigPubYear());
        System.out.println("Author: " + classic1.getTheAuthor().getName() + ", Publisher: " + classic1.getBookPublisher()[0].getName());
        System.out.println(classic1.binding());

        System.out.println("\nClassic 2:");
        System.out.println("ISBN: " + classic2.getIsbn() + ", Pages: " + classic2.getPages() + ", Original Publication Year: " + classic2.getOrigPubYear());
        System.out.println("Author: " + classic2.getTheAuthor().getName() + ", Publisher: " + classic2.getBookPublisher()[0].getName());
        System.out.println(classic2.createNotes());

        System.out.println("\nAnthology:");
        System.out.println("ISBN: " + anthology.getIsbn() + ", Pages: " + anthology.getPages());
        System.out.println("Story 1 Author: " + anthology.getStories()[0].getTheAuthors()[0].getName());
        System.out.println("Story 2 Author: " + anthology.getStories()[1].getTheAuthors()[0].getName());
        System.out.println(anthology.coverArt());
        System.out.println(anthology.storyOrder());

        System.out.println("\nNovel:");
        System.out.println("ISBN: " + novel.getIsbn() + ", Pages: " + novel.getPages());
        System.out.println("Author: " + novel.getTheAuthor()[0].getName());
        System.out.println("Novel Series Name: " + novel.getMySeries().getSeriesName());
        System.out.println(novel.theme());
        System.out.println(novel.coverArt());
        

        System.out.println("\nNonfiction:");
        System.out.println("ISBN: " + nonfiction.getIsbn() + ", Pages: " + nonfiction.getPages());
        System.out.println(nonfiction.topic());

        System.out.println("\nContract:");
        System.out.println("Date: " + contract.getDate());
        System.out.println("Publishers: " + contract.getPublisherInfo()[0].getName() + ", " + contract.getPublisherInfo()[1].getName());
        System.out.println("Authors: " + contract.getAuthorInfo()[0].getName() + ", " + contract.getAuthorInfo()[1].getName());
        System.out.println(contract.printContract());

        System.out.println("\nPublisher Letterhead:");
        System.out.println(publisher1.printLetterhead());
        System.out.println(publisher2.printLetterhead());
        System.out.println("\nStory Plot:");
        System.out.println(story1.plot());

        

        System.out.println("\nAdditional Information:");
        System.out.println("Publisher 1 Classics Catalog: " + publisher1.getClassicsCatalog()[0].getTheAuthor().getName());
        System.out.println("Publisher 2 Classics Catalog: " + publisher2.getClassicsCatalog()[0].getTheAuthor().getName());
        
    }
}
