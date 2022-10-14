class Movie{
    private final String name;
    private final List<Actor> actors;
    Movie(String name, List<Actor> actors){
        validate(actors);
        this.name = name;
        this.actors = actors;
    }

    private static void validate(List<Actor> actors){
        if(actors == null || actors.isEmpty()){
            throw new IllegalArgumentException("blablabla");
        }
    }

    public List<Actor> getActors(){
        return actors;
    }
};

class Actor{
    private final String name;
    private String lastname;
    Actor(String name){
        this.name = name;
        this.lastname = lastname;
    }

    public static Actor createActor(String name){
        if(name == null || name.isEmpty()){
            throw new IllegalArgumentException("");
        }
        final String[] names = name.split(" ");
        return new Actor(names[0], names[1]);
    }
}

class Main{
    public static void main(String[] args){
    final Movie lordOfTheRing = new Movie("Lord of The Ring",
        List.of(Actor.createActor("Vigo Mortensen"))
    );

    final List<a> actors = lordOfTheRing.getActors();
    actors.add(Actor.createActor("Gabriel Rovesti"));
    }
}