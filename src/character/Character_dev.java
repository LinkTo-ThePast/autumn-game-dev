package character;

public class Character_dev {
	  private String name; 
	  private String last_name;
	  private String lore;
	  private int age; 
	  
	  private int healthPoints;
	  private int physicalAttackPoints; 
	  private int specialAttackPoints;
	  
	  private int currentLevel;
	  private int defensePoints; 
	  private int speedPoints; 
	  private boolean affectedStatus; 
	  
	  // basic functionalities
	  
	  // getters and setters;
	  public String getCharacterName() {
	    return this.name;
	  }
	  
	  public void setCharacterName(String name) {
	    StringBuilder sb = new StringBuilder();
	    for(int i = 0; i < name.length(); i++) {
	      char c = name.charAt(i);
	      if (Character.isAlphabetic(c)) {
	        sb.append(c);
	      } else {
	        System.out.println("Please, introduce a valid character!");
	      }
	    }
	    
	    this.name = sb.toString();
	  }
	  
	  public String getLastName() {
	    return this.last_name;
	  }
	  
	  public void setLastName(String lastName) {
	    StringBuilder sb = new StringBuilder();
	    for (int i = 0; i < lastName.length(); i++) {
	      char c = lastName.charAt(i);
	      if (Character.isAlphabetic(c)) {
	        sb.append(c);
	      } else {
	        System.out.println("Please, introduce a valid character! It has to be alphabetic.");
	      }
	    }
	    this.last_name = sb.toString();
	  }
	  
	  public String getLore() {
	    return this.lore;
	  }
	  
	  public void setLore(String lore) {
	    this.lore = lore;
	  }
	  
	  public int getAge() {
	    return this.age;
	  }
	  
	  public void setLore(int age) {
	    if(age >= 1) {
	      this.age = age;
	    } else {
	      System.out.println("Please, introduce a valid age!");
	    }
	  }
	  
	  public int getPhysicalAttackPoints() {
	    return this.physicalAttackPoints;
	  }
	  
	  public void setPhysicalAttackPoints(int phyAtkPoints) {
	    if (phyAtkPoints < 0) {
	      System.out.println("Please, introduce quantites greater than zero!");
	    } else {
	    this.physicalAttackPoints = phyAtkPoints;
	    
	    }
	  }
	  
	  public int getSpecialAtkPoints() {
	    return this.specialAttackPoints;
	  }
	  
	  public void setSpecialAtkPoints(int specialAtkPoints) {
	    if (specialAtkPoints < 0) {
	      System.out.println("Please, introduce quantities greater than zero");
	    }
	    this.specialAttackPoints = specialAtkPoints;
	  }
	  
	  public int getLevel() {
	    return this.currentLevel;
	  }
	  
	  public void setLevel(int lvl) {
	    if (lvl < 0) {
	      System.out.println("Please, introduce quantities greater than zero");
	    }
	    this.currentLevel = lvl;
	  }
	  
	  public int getDefPoints() {
	    return this.defensePoints;
	  }
	  
	  public void setDefPoints(int defPoints) {
	    if (defPoints < 0) {
	      System.out.println("Please, introduce quantities greater than zero");
	    }
	    this.defensePoints = defPoints;
	  }
	  
	  public int getSpeedPoints() {
	    return this.speedPoints;
	  }
	  
	  public void setSpeedPoints(int speedPoints) {
	    this.speedPoints = speedPoints;
	  }
	  
	  public boolean getAffectedStatus() {
	    return this.affectedStatus;
	  }
	  
	  public void setAffectedStatus() {
	    
	  }
	  
	  // methods 
	  
	  // 1. Deceased 
	  public boolean isDeceased() {
	    
	    if (this.healthPoints <= 0) {
	      return true;
	    } else {
	      return false;
	    } // representing the state of the object 
	  }
	 
	  public int actualDmg() {
	    int actualDmg = this.physicalAttackPoints * this.currentLevel;  // phyAttk = 10 ; currLvl = 1 ; crrLvl = 50 ; 
	    return actualDmg;
	  }
	  
	  public int dmgMitigated() {
	    int dmgMitigated = this.defensePoints * this.currentLevel;
	    return dmgMitigated;
	  }
	  
	  public int healthLoss() {
	    int actualDmg = 0; // foe's actualDmg
	    int healthLoss = this.healthPoints - (actualDmg - this.dmgMitigated());
	    // scenario 1: actual losing health -> dmgMitigated < actualDmg: (actDmg -> 100 %; 100*(x)
	    return healthLoss;
	  }
	  // constructor
	  public Character_dev(String name, String last_name, String lore, int age, int healthPoints, int physicalAttackPoints, int specialAttackPoints, int defensePoints, int speedPoints, int currentLevel, boolean affectedStatus) {
	    this.name = name;
	    this.last_name = last_name;
	    this.lore = lore;
	    this.age = age;
	    this.healthPoints = healthPoints;
	    this.physicalAttackPoints = physicalAttackPoints;
	    this.specialAttackPoints = specialAttackPoints;
	    this.currentLevel = currentLevel;
	    this.speedPoints = speedPoints;
	    this.affectedStatus = affectedStatus;
	    this.defensePoints = defensePoints;
	  }

}
