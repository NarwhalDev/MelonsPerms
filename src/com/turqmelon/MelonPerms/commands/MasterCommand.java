package com.turqmelon.MelonPerms.commands;

/*******************************************************************************
 * Copyright (c) 2016.  Written by Devon "Turqmelon": http://turqmelon.com
 * For more information, see LICENSE.TXT.
 ******************************************************************************/


import java.util.ArrayList;
import java.util.List;

public class MasterCommand {

    private String name;
    private List<SubCommand> commands = new ArrayList<>();

    public MasterCommand(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<SubCommand> getCommands() {
        return commands;
    }
}
