package org.talia;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@EqualsAndHashCode
@Getter
@Setter
public class Department {
    @Getter
    private String departmentId;
    @Getter
    private String departmentName;
    private static int nextId = 1;

    public Department(String departmentName) {
        if (validateDepartmentName(departmentName)) {
            this.departmentId = "D" + nextId++;
            this.departmentName = departmentName;
        } else {
            this.departmentId = null;
            this.departmentName = null;
        }
    }

    /**
     * Checks if a department name contains only letters or space
     * @param departmentName the input string
     * @return true if the department name is valid
     */
    public static boolean validateDepartmentName(String departmentName) {
        return departmentName != null && departmentName.matches("[a-zA-Z ]+");
    }

    public void setDepartmentName(String departmentName) {
        this.departmentId = departmentId;
        this.departmentName = Util.toTitleCase(departmentName);
    }
}
