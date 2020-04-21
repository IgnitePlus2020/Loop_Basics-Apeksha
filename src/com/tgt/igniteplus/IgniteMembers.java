package com.tgt.igniteplus;
import java.util.*;
public class IgniteMembers {

        private String name;
        private String college;
        private int age;
        private Set<String> skillSet;

        public IgniteMembers(){}

        public IgniteMembers(String name, String college, int age, Set<String> skillSet) {
            this.name = name;
            this.college = college;
            this.age = age;
            this.skillSet = skillSet;
        }
    public String getName() {
            return name;
    }

    public void setName(String name) {
            this.name = name;
    }

    public String getCollege() {
            return college;
    }

    public void setCollege(String college) {
            this.college = college;
    }

    public int getAge() {
            return age;
    }

    public void setAge(int age) {
            this.age = age;
    }

    public Set<String> getSkillSet() {
            return skillSet;
    }

    public void setSkillSet(Set<String> skillSet) {
            this.skillSet = skillSet;
    }

}

