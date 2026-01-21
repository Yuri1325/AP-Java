
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
  boolean fridgeOpen;
  boolean tongsTaken;
  boolean screwDriverTaken;
  
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
    fridgeOpen = false;
    tongsTaken = false;
    screwDriverTaken = false;
  
    
    
  }

  public void play()
  {
    
    // start of adventure. You can change this if you like
    
    
    // ask the user for their name.
    int randomSelector = ((int)(Math.random()*7));
    
    switch (randomSelector) {
      
        case 0:
            setZone_Couch();
            break;
        case 1:
            setZone_Door();
            break;
        case 2:
            setZone_Fridge();
            break;
        case 3:
            setZone_Kitchen();
            break;
        case 4:
            setZone_Mattress();
            break;
        case 5:
            setZone_Sink();
            break;
        case 6:
            setZone_Vent();
            break;
        case 7:
            setZone_Wide_View();
            break;
        default:
            // Optional: handle cases not covered above
            break;
    
    
    }
  
    // Change player's name
    // ADD CODE HERE;
    
    // describe the starting situation. Feel free to change this

    // get user input and go to the appropriate zone based on their input
    // ADD CODE HERE
  
  }
  private int getInput(){
    try{
          return Integer.parseInt(inScanner.next().replaceAll("\\D", ""));
          }catch(NumberFormatException e){
            return 0;
          }
  }
  private void print(String x){
      System.out.println("  "+x+"\n ");
  }
  private void checkWake(){
    if (wake){
        wake = false;
        print("You wake up feeling disoriented with a pounding headache. You appear to be in a cabin of some sort yet you have no memory of how you got here.\n The air in the room is thin and it is becoming increasingly difficult to breathe. You know you have a limited amount of time before you suffocate");}
  }
  private void setZone_Mattress(){
    int input;
    checkWake();
      console.setImage("images/matress.png");
      
        print("(0/Enter)-Approach vent | 1-Turn around | 2-Inspect matress");
        input = getInput();
        
      
      if (input==0)
          setZone_Vent();
        else if(input==1)
          setZone_Wide_View();
        else if(input==2){
          print("You inspect the mattress you woke up from. It’s filthy and littered with stains and tears");
          setZone_Mattress();
        }else{
          setZone_Mattress();
          
        }
  }
  

  private void setZone_Vent(){
    int input;
    checkWake();

    
    if(ventOpen){
      if(cuttersTaken){
        console.setImage("images/insideVent.png");
        print("The vent is screwed onto the wall maybe you can remove it with a screwdriver");
        print("(0/Enter)-Go back");
        input =  getInput();
      }else{
        console.setImage("images/insideVentW.png");
        print("(0/Enter)-Go back | 1-Take bolt cutters ");
        input = getInput();
      }
    }else{
      if (player.invetory.contains("screwdriver")){
        console.setImage("images/vent.png");
        print("The vent is screwed onto the wall maybe you can remove it with a screwdriver");
        print("(0/Enter)-Go back | 2-Open Vent");
        input = getInput();
      }else{
        console.setImage("images/vent.png");
        print("The vent is screwed onto the wall maybe you can remove it with a screwdriver");
        print("(0/Enter)-Go back  ");
        input = getInput();
      }
      
    }
    if(input==0){
      setZone_Mattress();
    }else if (input==1&&ventOpen){
      print("You take the bolt cutters");
      cuttersTaken = true;
      player.invetory.add("cutters");
      setZone_Vent();
    }else if(input == 2&&player.invetory.contains("screwdriver")){
        ventOpen = true;
        print("With the screwdriver you remove the vent from the wall, where you find a pair of bolt cutters. ");
        setZone_Vent();
    }else{
      setZone_Vent();
    }
      
  }


  private void setZone_Wide_View(){
      int input;
    checkWake();
      if(couchMoved){
        console.setImage("images/rcm.png");
      }else{
      console.setImage("images/room.png");
      }
      print("(0/Enter)-Go to matress | 1-Go to the door | 2-Go to the couch | 3-Go to the kithcen" );
      input = getInput();
      if(input ==0){
        setZone_Mattress();
      }else if (input==1){
        setZone_Door();
      }else if (input==2){
        setZone_Couch();
      }else if(input==3){
        setZone_Kitchen();
      }else{
        setZone_Wide_View();
      }
    }
    private void setZone_Door(){
      int input;
    checkWake();
      if(couchMoved){
        console.setImage("images/door_blocked.png");
        print("You approach the door but it's blocked by the couch");
        print("(0/Enter)- Go back | 1-Move the couch");
        input  = inScanner.nextInt();
      }else{
        console.setImage("images/door.png");
        if(player.invetory.contains("key")){
          print("You approach the door*, it appear to be locked from the outside with the key hole facing you *");
          print("(0/Enter)-Go back | 2-Open door");
          input = getInput();
        }else{
          print("You approach the door*, it appear to be locked from the outside with the key hole facing you *");
          print("(0/Enter)-Go back");
          input = getInput();

          
        }
      }
      if (input==0){
        setZone_Wide_View();
      }else if(input ==1&&couchMoved){
        couchMoved = false;
        setZone_Door();
      }else if(input==2&&player.invetory.contains("key")){
        goodEnding();
      }else{
        setZone_Door();
      }
    }
    private void setZone_Couch(){
      int input;
    checkWake();
      if(couchMoved){
        
        if(hatchOpen){
          if(keyTaken){
            console.setImage("images/insideHatch.png");
            print("(0/Enter)-Go back");
            input = getInput();
          }else{
            console.setImage("images/insideHatchW.png");
            print("(0/Enter)-Go back | 1-Take key");
            input = getInput();
          }
        }else{
          console.setImage("images/hatch.png");
          if(player.invetory.contains("cutters")){
            print("(0/Enter)-Go back | 2-Open hatch");
            input = getInput();
          }else{
            print("You inspect the hatch, it has a chain keeping it locked");
            print("(0/Enter)-Go back");
            input = getInput();
          }

        }

      }else{
      console.setImage("images/couch.png");
      //print("You inspect the couch. Like the mattress its filthy and littered with stains and tears.\n You see scuff marks on the floor like it has been moved alot");
      print("(0/Enter)-Go back | 3-Search between the cushions | 4-Move couch");
      input = getInput();

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
      }else if(input==4&&!couchMoved){
        print("You push the couch to the left and discover the hatch located below it ");
        couchMoved = true;
        setZone_Couch();
      }else{
        setZone_Couch();
      }
    }
    private void setZone_Kitchen(){
      int input;
    checkWake();
      console.setImage("images/kitchen.png");
      print("(0/Enter)-Go back | 1-Go to fridge | 2-Go to sink");
      input = getInput();
      if(input==0){
        setZone_Wide_View();
      }else if(input==1){
        setZone_Fridge();
      }else if (input==2){
        setZone_Sink();
      }else{
        setZone_Kitchen();
      }

  }
    private void setZone_Fridge(){
      int input;
    checkWake();
      if (fridgeOpen){
        console .setImage("images/infrdg.png");
        if(tongsTaken){
          print("The fridge is filled with junk and stinks");
          print("(0/Enter)-Go back");
          input = getInput();
        }else{
          print("You look in the fridge and behind all the junk you see a pair of grill tongs");
          print("(0/Enter)-Go back | 2-Take tongs");
          input = getInput();
        }
      }else{
        console.setImage("images/fridge.png");
        print("(0/Enter)-Go back | 1-Open fridge");
        input = getInput();
      }
      if(input==0){
        setZone_Kitchen();
      }else if(input==1&&!fridgeOpen){
        fridgeOpen = true;
        print("You open the fridge");
        setZone_Fridge();
      }else if(input==2&&fridgeOpen&&!tongsTaken){
        player.invetory.add("tongs");
        tongsTaken = true;
        fridgeOpen = false;
        setZone_Fridge();
      }else{
        setZone_Fridge();
      }
    }
    private void setZone_Sink(){
      int input;
    checkWake();
      console.setImage("images/sink.png");
      if(player.invetory.contains("tongs")&&!screwDriverTaken){
        print("(0/Enter)-Go back |1-Reach into the sink drain | 2-Use tongs");
        input = getInput();
      }else{
        print("(0/Enter)-Go back |1-Reach into the sink drain");
        input = getInput();
      }
      if(input==0){
        setZone_Kitchen();
      }else if (input==1){
        
          print("You reach your hand in the sink , its disgusting and gooey .You feel something hard but you cant quite grasp it.");
        
        setZone_Sink();
      }else if(input==2&&player.invetory.contains("tongs")&&!screwDriverTaken){
        print("You insert the tongs into the drain and grap what appears to be a screwdriver - You take it.");
        player.invetory.add("screwdriver");
        screwDriverTaken = true;
        setZone_Sink();


      }else{
        setZone_Sink();
      }
    }
  private void goodEnding()
  {
    console.setImage("images/outside.jpg");
    print("YOU SURVIVED. YIPPEE");
    print("But....this isn't the end you still have to find your way home in part 2 (NEXT PROJECT)");
    
    inScanner.close();
  }
}