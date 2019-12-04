package com.example.demo.softwaredesign;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BossTest {
    Boss boss;

    @BeforeEach
    void setUp() {
        boss = new Boss();
    }

    @Test
    void commandCheckNumber() {
        TeamLeader teamLeader = new TeamLeader();
        boss.commandCheckNumber(teamLeader);
    }
}