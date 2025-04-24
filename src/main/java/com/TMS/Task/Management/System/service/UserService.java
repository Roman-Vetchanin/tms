package com.TMS.Task.Management.System.service;

import com.TMS.Task.Management.System.dto.NewPassword;
import com.TMS.Task.Management.System.dto.UpdateUser;
import com.TMS.Task.Management.System.dto.User;

public interface UserService {
    boolean setNewPassword(NewPassword newPassword);

    User getUser();

    UpdateUser updateUser(UpdateUser userPatch);

}
