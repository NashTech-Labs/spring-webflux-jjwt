package com.knoldus.springboot.webfluxjjwt.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.knoldus.springboot.webfluxjjwt.model.security.Role;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.security.core.GrantedAuthority;

class UserTest {
    /**
     * Method under test: {@link User#isEnabled()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testIsEnabled() {
        // TODO: Complete this test.
        (new User()).isEnabled();
    }

    /**
     * Method under test: {@link User#isEnabled()}
     */
    @Test
    void testIsEnabled2() {
        User user = new User();
        user.setEnabled(true);
        assertTrue(user.isEnabled());
    }

    /**
     * Method under test: {@link User#isEnabled()}
     */
    @Test
    void testIsEnabled3() {
        User user = new User();
        user.setEnabled(false);
        assertFalse(user.isEnabled());
    }

    /**
     * Method under test: {@link User#getAuthorities()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetAuthorities() {
        // TODO: Complete this test.

        (new User()).getAuthorities();
    }

    /**
     * Method under test: {@link User#getAuthorities()}
     */
    @Test
    void testGetAuthorities2() {
        User user = new User();
        user.setRoles(new ArrayList<>());
        assertTrue(user.getAuthorities().isEmpty());
    }

    /**
     * Method under test: {@link User#getAuthorities()}
     */
    @Test
    void testGetAuthorities3() {
        ArrayList<Role> roleList = new ArrayList<>();
        roleList.add(Role.ROLE_USER);

        User user = new User();
        user.setRoles(roleList);
        Collection<? extends GrantedAuthority> actualAuthorities = user.getAuthorities();
        assertEquals(1, actualAuthorities.size());
        assertEquals("ROLE_USER", ((List<? extends GrantedAuthority>) actualAuthorities).get(0).getAuthority());
    }

    /**
     * Method under test: {@link User#getAuthorities()}
     */
    @Test
    void testGetAuthorities4() {
        ArrayList<Role> roleList = new ArrayList<>();
        roleList.add(Role.ROLE_USER);
        roleList.add(Role.ROLE_USER);

        User user = new User();
        user.setRoles(roleList);
        Collection<? extends GrantedAuthority> actualAuthorities = user.getAuthorities();
        assertEquals(2, actualAuthorities.size());
        assertEquals("ROLE_USER", ((List<? extends GrantedAuthority>) actualAuthorities).get(0).toString());
        assertEquals("ROLE_USER", ((List<? extends GrantedAuthority>) actualAuthorities).get(1).toString());
    }

    /**
     * Methods under test:
     *
     */
    @Test
    void testConstructor() {
        User actualUser = new User();
        actualUser.setPassword("iloveyou");
        actualUser.setUsername("janedoe");
        assertEquals("iloveyou", actualUser.getPassword());
        assertEquals("janedoe", actualUser.getUsername());
        assertFalse(actualUser.isAccountNonExpired());
        assertFalse(actualUser.isAccountNonLocked());
        assertFalse(actualUser.isCredentialsNonExpired());
    }
}

