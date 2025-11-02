import java.util.*;

public class TextAdventure 
{
  FancyConsole console;
  Scanner inScanner;
  Player player;
  boolean wake;
  boolean ventOpen;
  boolean cuttersTaken;
  boolean couchMoved;
  boolean hatchOpen;
  boolean keyTaken;

  public TextAdventure()
  {
    console = new FancyConsole("Great Text Adventure!", 1000, 1000);
    inScanner = new Scanner(System.in);

    // feel free to change the player's starting values
    player = new Player(100);
    wake = true;
    ventOpen = false;
    cuttersTaken = false;
    couchMoved = false;
    hatchOpen = false;
    
  }

  public void play()
  {
    int input;
    // start of adventure. You can change this if you like
    
    
    // ask the user for their name.
    
    setZone_Mattress();
    
    // Change player's name
    // ADD CODE HERE
    
    // describe the starting situation. Feel free to change this

    // get user input and go to the appropriate zone based on their input
    // ADD CODE HERE
  
  }

  private void print(String x){
      System.out.println("  "+x+"\n ->");
  }
  private void setZone_Mattress(){
    int input;
      console.setImage("images/matress.png");
      if (wake){
        wake = false;
        print("You wake up feeling disoriented with a pounding headache. You appear to be in a cabin of some sort yet you have no memory of how you got here.\n The air in the room is thin and it is becoming increasingly difficult to breathe. You know you have a limited amount of time before you suffocate");
        print("0-Approach vent | 1-Turn around | 2-Inspect matress");
        input = inScanner.nextInt();
        
      }else{
        print("0-Approach vent | 1-Turn around | 2-Inspect matress");
        input = inScanner.nextInt();
        
      }
      if (input==0)
          setZone_Vent();
        else if(input==1)
          setZone_Wide_View();
        else if(input==2)
          print("You inspect the mattress you woke up from. It’s filthy and littered with stains and tears");
          setZone_Mattress();
  }
  
  private void setZone_Vent(){
    int input;
    if(ventOpen){
      if(cuttersTaken){
        console.setImage("images/insideVent.png");
        print("The vent is screwed onto the wall maybe you can remove it with a screwdriver");
        print("0-Go back");
        input =  inScanner.nextInt();
      }else{
        console.setImage("images/inideVentW.png");
        print("0-Go back | 1-Take bolt cutters ");
        input = inScanner.nextInt();
      }
    }else{
      if (player.invetory.contains("screwdriver")){
        console.setImage("images/vent.png");
        print("The vent is screwed onto the wall maybe you can remove it with a screwdriver");
        print("0-Go back | 2-Open Vent");
        input = inScanner.nextInt();
      }else{
        console.setImage("images/vent.png");
        print("The vent is screwed onto the wall maybe you can remove it with a screwdriver");
        print("0-Go back  ");
        input = inScanner.nextInt();
      }
      
    }
    if(input==0)
      setZone_Mattress();
    else if (input==1&&ventOpen){
      print("You take the bolt cutters");
      cuttersTaken = true;
      player.invetory.add("cutters");
      setZone_Vent();
    }else if(input == 2&&player.invetory.contains("screwdriver")){
        ventOpen = true;
        print("With the screwdriver you remove the vent from the wall, where you find a pair of bolt cutters. ");
        setZone_Vent();
    }
      
  }


  private void setZone_Wide_View(){
      int input;
      console.setImage("images/room.png");
      print("0-Go to matress | 1-Go to the door | 2-Go to the couch | 3-Go to the kithcen" );
      input = inScanner.nextInt();
      if(input ==0){
        setZone_Mattress();
      }else if (input==1){
        setZone_Door();
      }else if (input==2){
        setZone_Couch();
      }else if(input==3){
        setZone_Kitchen();
      }
    }
    private void setZone_Door(){
      int input;
      if(couchMoved){
        console.setImage("images/door_blocked.png");
        print("You approach the door but it's blocked by the couch");
        print("0- Go back | 1-Move the couch");
        input  = inScanner.nextInt();
      }else{
        console.setImage("images/door.png");
        if(player.invetory.contains("key")){
          print("You approach the door*, it appear to be locked from the outside with the key hole facing you *");
          print("0-Go back | 2-Open door");
          input = inScanner.nextInt();
        }else{
          print("You approach the door*, it appear to be locked from the outside with the key hole facing you *");
          print("0-Go back");
          input = inScanner.nextInt();
        }
      }
      if (input==0){
        setZone_Wide_View();
      }else if(input ==1&&couchMoved){
        couchMoved = false;
        setZone_Door();
      }else if(input==2&&player.invetory.contains("key")){
        gameEnd();
      }
    }
    private void setZone_Couch(){
      int input;
      if(couchMoved){
        
        if(hatchOpen){
          if(keyTaken){
            console.setImage("images/insideHatchW.png");
            print("0-Go back");
            input = inScanner.nextInt();
          }else{
            console.setImage("images/insideHatch.png");
            print("0-Go back | 1-Take key");
            input = inScanner.nextInt();
          }
        }else{
          console.setImage("images/hatch.png");
          if(player.invetory.contains("cutters")){
            print("0-Go back | 2-Open hatch");
            input = inScanner.nextInt();
          }else{
            print("You inspect the hatch, it has a chain keeping it locked");
            print("0-Go back");
            input = inScanner.nextInt();
          }

        }

      }else{
      console.setImage("images/couch.png");
      //print("You inspect the couch. Like the mattress its filthy and littered with stains and tears.\n You see scuff marks on the floor like it has been moved alot");
      print("0-Go back | 3-Search between the cushions");
      input = inScanner.nextInt();

    }
      if (input==0){
        setZone_Wide_View();
      }else if(input==1&&couchMoved&&!keyTaken){
          print("You take the key");
          player.invetory.add("key");
          keyTaken = true;
          setZone_Couch();
      }else if(input==2&&couchMoved&&player.invetory.contains("cutters")){
        print("You put the bolt covers around the chain and squeeze hard and it snaps. The hatch is free to open.");
        hatchOpen = true;
        setZone_Couch();

      }else if(input==3){
        print("You stick your hand between the cushions - theres nothing there but dirt and crumbs");
        setZone_Couch();
      }
    }
    private void setZone_Kitchen(){
      int input;
      console.setImage("images/kitchen.png");
      print("0-Go back | 1-Go to fridge | 2-Go to sink");
      input = inScanner.nextInt();
      if(input==0){
        setZone_Wide_View();
      }else if(input==1){
        setZone_Fridge();
      }else if (input==2){
        setZone_Sink();
      }

  }
    private void setZone_Fridge(){
      console.setImage("images/fridge.png");
    }
    private void setZone_Sink(){
      console.setImage("images/sink.png");
    }
  private void gameEnd()
  {
    // ADD CODE HERE

    inScanner.close();
  }
}