package Animals;

import java.util.*;

abstract public class Animal {
    protected String name;
    protected Date birthday;
    protected boolean isPet;
    protected ArrayList<String> knownCommands;
    protected ArrayList<String> canLearnCommands;

    public Animal(boolean isPet, String[] _knownCommands, String[] _canLearnCommands) {
        this.isPet = isPet;
        this.knownCommands = new ArrayList<>(List.of(_knownCommands));
        this.canLearnCommands =  new ArrayList<>(List.of(_canLearnCommands));
    }

    public void LearnNewCommand(String newCommand) {
        for (String command : knownCommands) {
            if (Objects.equals(newCommand, command)) {
                System.out.printf("%s is already known command: %s%n", name, newCommand);
                return;
            }
        }
        for (String command : canLearnCommands) {
            if (Objects.equals(newCommand, command)) {
                knownCommands.add(newCommand);
                System.out.printf("%s now knows new command: %s%n", name, newCommand);
                return;
            }
        }
        System.out.printf("%s can't learn command: %s%n", name, newCommand);
    }

    public String getName() {return name;}
    public List<String> getKnownCommands() {return knownCommands;}
    public List<String> getCanLearnCommands() {return canLearnCommands;}
}
