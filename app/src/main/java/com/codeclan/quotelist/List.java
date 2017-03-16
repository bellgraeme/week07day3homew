package com.codeclan.quotelist;

import java.util.ArrayList;

public class List {

    private ArrayList<Quote> list;


    public List() {
        list = new ArrayList<Quote>();
        list.add(new Quote("Any negative polls are fake news, just like the CNN, ABC, NBC polls in the election. Sorry, people want border security and extreme vetting."));
        list.add(new Quote("Watched protests yesterday but was under the impression that we just had an election! Why didn’t these people vote? Celebs hurt cause badly"));
        list.add(new Quote("We are going to have an unbelievable, perhaps record-setting turnout for the inauguration, and there will be plenty of movie and entertainment stars. All the dress shops are sold out in Washington. It’s hard to find a great dress for this inauguration"));
        list.add(new Quote("Happy New Year to all, including to my many enemies and those who have fought me and lost so badly they just don’t know what to do. Love!"));
        list.add(new Quote("An ‘extremely credible source’ has called my office and told me that Barack Obama’s birth certificate is a fraud."));
        list.add(new Quote("Robert Pattinson should not take back Kristen Stewart. She cheated on him like a dog & will do it again – just watch. He can do much better!"));
        list.add(new Quote("Ariana Huffington is unattractive, both inside and out. I fully understand why her former husband left her for a man – he made a good decision."));
        list.add(new Quote("I will build a great wall – and nobody builds walls better than me, believe me – and I’ll build them very inexpensively. I will build a great, great wall on our southern border, and I will make Mexico pay for that wall. Mark my words."));
        list.add(new Quote("When Mexico sends its people, they’re not sending the best. They’re not sending you, they’re sending people that have lots of problems and they’re bringing those problems with us. They’re bringing drugs. They’re bring crime. They’re rapists… And some, I assume, are good people."));
        list.add(new Quote("Our great African-American President hasn’t exactly had a positive impact on the thugs who are so happily and openly destroying Baltimor"));
        list.add(new Quote("If I were running ‘The View’, I’d fire Rosie O’Donnell. I mean, I’d look at her right in that fat, ugly face of hers, I’d say ‘Rosie, you’re fired"));
        list.add(new Quote("All of the women on The Apprentice flirted with me – consciously or unconsciously. That’s to be expected"));
        list.add(new Quote("One of they key problems today is that politics is such a disgrace. Good people don’t go into government"));
        list.add(new Quote("The beauty of me is that I’m very rich."));
        list.add(new Quote("It’s freezing and snowing in New York – we need global warming!"));
        list.add(new Quote("I’ve said if Ivanka weren’t my daughter, perhaps I’d be dating her."));
        list.add(new Quote("My fingers are long and beautiful, as, it has been well documented, are various other parts of my body."));
        list.add(new Quote("I have never seen a thin person drinking Diet Coke."));
        list.add(new Quote("I think the only difference between me and the other candidates is that I’m more honest and my women are more beautiful."));
        list.add(new Quote("My Twitter has become so powerful that I can actually make my enemies tell the truth."));
    }

    public ArrayList<Quote> getList() {
        return new ArrayList<Quote>(list);
    }

}
