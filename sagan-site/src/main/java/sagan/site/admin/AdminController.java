package sagan.site.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Controller that handles requests for the root admin page. Administrative operations for
 * /blog, /team and /projects subsections are handled by their respective controllers.
 * 
 * @see sagan.site.blog.admin.BlogAdminController
 * @see sagan.site.team.admin.TeamAdminController
 * @see sagan.site.projects.admin.ProjectAdminController
 */
@Controller
class AdminController {

    @RequestMapping("/admin")
    public String adminPage() {
        return "admin/show";
    }
}
