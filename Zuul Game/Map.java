                                                                                                                                                                    
/**
 * Write a description of class Map here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Map
{
    private Room building;
    private Room start;
    private Room eastForest;
    private Room westForest;
    private Room valley;
    private Room river;
    private Room grate;
    private Room smallChamber;
    private Room hole;
    private Room largeChamber;
    private Room kingsHall;
    
    private String description;
    
    /**
     * Constructor for objects of class Map
     */
    public Map()
    {
        createStart();
        createBuilding();
        createEastForest();
        createWestForest();
        createValley();
        createRiver();
        createGrate();
        createSmallChamber();
        createHole();
        createKnightsChamber();
        createKingsHall();
    }
    
    public Room getStartRoom()
    {
        return start;
    }
    
    /**
     * This is the room the player starts in
     */
    private void createStart()
    {
        start = new Room(0, " outside Medieval House");

        description =  
        " standing at the end of a road before a Medieval \n" +
        " House. Around you is a forest. A small stream\n" +
        " flows out of the building and down a river.";
        
        start.setWater();
        start.setDescription(description);
        start.setItem(ItemTypes.BOTTLE, "\n There is an empty bottle on the ground");
    }
    
    /**
     * The building is North of the Start and contains
     * important items that need to be picked up
     */
    private void createBuilding()
    {
        building = new Room(2, "inside Medieval House");
        
        description =  " In a medieval house with a table and chairs . ";
        
        building.setDescription(description);
        building.setItem(ItemTypes.KEY, "\n There are some keys on the ground here.");
        connectRooms(start, "north", building);
    }

    private void createEastForest()
    {
        eastForest = new Room(3, "lost in a vast Forest");
        
        description =  " up a hill, still in the forest.  \n The road";
        description += " slopes back down the other side of the hill.";
        description += " \n There is a building in the distance";
        
        eastForest.setDescription(description);        
        
        //eastForest.setExit("west", start);
        //start.setExit("east", eastForest);
        connectRooms(start, "east", eastForest);        
    }
    
    private void createWestForest()
    {
        westForest = new Room(4, "lost in an assortment of trees");
        
        description =  " surrounded by trees, with a deep valley to one side";
        westForest.setDescription(description);        
        
        connectRooms(start, "west", westForest);
    }
    
    /**
     * 
     */
    private void createValley()
    {
        valley = new Room(5, "in a deep valley");
        
        description = " in a deep valley in the forest beside a stream";
        description += "\n tumbling along a rocky bed.";
        valley.setDescription(description);
        
        valley.setWater();
        valley.setItem(ItemTypes.FOOD,
            "\n There are a couple of apple trees with fruit");
            
        connectRooms(start, "south", valley);
        
        Room forest = cloneRoom(6, eastForest);
        connectRooms(valley, "east", forest);
        
        forest = cloneRoom(7, westForest);
        connectRooms(valley, "west", forest);        
    }

    private void createRiver()
    {
        river = new Room(8, "at a river");
        
        description = "standing, at your feet all the water of the river";
        description += " \n You could gather water with a bottle here  ";
     
        
        river.setDescription(description);
        river.setWater();
        
        connectRooms(river, "north", valley);
    }
    
    private void createGrate()
    {
        grate = new Room(9, "beside a grate");
        
        description = " You are beside a grate which looks like it can be opened ";
        description += " \n The grate is locked";
        description += " \n It can be unlocked with a key ";

        grate.setDescription(description);
        connectRooms(grate, "north", river);
    }
    
    private void createSmallChamber()
    {
        smallChamber = new Room(10, "in a chamber");
        
        description = "in a small chamber beneath a"; 
        description +=("\ngrate to the surface.");
        description +=("\n There is a hole to the west which can be entered.");
        
        smallChamber.setDescription(description);
        connectRooms(smallChamber, "up", grate);
    }
    
    private void createHole()
    {
        hole = new Room(10, "crawling through a hole");
        
        description = "crawling through a narrow hole";
        description +=("\nThere is a dim light at the east end of the hole.");
        
        hole.setDescription(description);
        connectRooms(hole, "west", smallChamber);
    }
    
    private void createKnightsChamber()
    {
        largeChamber = new Room(10, "in a knights chamber ");
        
        description = "in a large chamber with armour and weapons ";
        description +=("\nThe walls look like they are damaged and have detoriated. ");
        description +=("\n It looks to have not been used for some time \nThere are passages off in all directions.");
        
        largeChamber.setDescription(description);
        connectRooms(largeChamber, "west", hole);
        
        Room pit = new Room(11, "in a small pit");
        description = "You have fallen in a small pit with only one way out. ";
        description +=("A east passage ends here except for a small crack leading on");
        pit.setDescription(description);
        
        connectRooms(pit, "west", largeChamber);
    
        Room  rocks = new Room(12, "this passage is full of rocks");
        description = "theres no way forward.";
        rocks.setDescription(description);
        
        connectRooms(rocks, "north", largeChamber);
        
   
    }
    
    private void createKingsHall()
    {
        kingsHall = new Room(14, "in the King's Hall");
        
        description = "in the Hall of a  fallen king ";
        description +=("\nThe hall is filled with what looks to be the kings treasure ");
        description +=("\nThere are armour stands with the knights who served the king.");
        
        kingsHall.setItem(ItemTypes.TREASURE, 
            "\n There is an old chest filled with treasure");
        
        kingsHall.setDescription(description);
        connectRooms(kingsHall, "south", largeChamber);        
    }
    
    private void connectRooms(Room room, String direction, Room otherRoom)
    {
        room.setExit(direction, otherRoom);
        
        if(direction.equals("east"))
        {
            otherRoom.setExit("west", room);
        }
        else if(direction.equals("west"))
        {
            otherRoom.setExit("east", room);
        }
        else if(direction.equals("north"))
        {
            otherRoom.setExit("south", room);
        }
        else if(direction.equals("south"))
        {
            otherRoom.setExit("north", room);
        }
        else if(direction.equals("down"))
        {
            otherRoom.setExit("up", room);
        }
        else if(direction.equals("up"))
        {
            otherRoom.setExit("down", room);
        }        
    }
    
    private Room cloneRoom(int id, Room toClone)
    {
        Room room = new Room(id, toClone.getName());
        room.setDescription(toClone.getDescription());

        return room;
    }
    
  
}
