package com.macoloc.viewpreparers;

import org.apache.tiles.AttributeContext;
import org.apache.tiles.context.TilesRequestContext;
import org.apache.tiles.preparer.ViewPreparer;

import com.macoloc.domain.Roommate;
import com.macoloc.form.LoginForm;

public class MasterPreparer implements ViewPreparer {

   @Override
   public void execute(TilesRequestContext tilesContext, AttributeContext attributeContext) {

      // You can add result to your request scope:
      //tilesContext.getRequestScope().put("test", "test");
      Roommate roommate = (Roommate) tilesContext.getSessionScope().get("user");
      if (roommate != null) {
    	  tilesContext.getRequestScope().put("user", roommate);
      } else {
    	  tilesContext.getRequestScope().remove("user");
    	  tilesContext.getRequestScope().put("loginForm", new LoginForm());
      }


      // Or you can add it as attribute for the view
      //attributeContext.putAttribute("rowsFromDb", new Attribute(), true);

   }

}