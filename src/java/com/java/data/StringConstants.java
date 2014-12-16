/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.data;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author michael
 */
public class StringConstants {

    private final String ratesHeaderText = "Rates";
    private final String aboutUsHeaderText = "About Us";
    private final String skillSetHeaderText = "Skills/Technologies";
    private final String templatePrevWorkHeaderText = "Templates/Previous Jobs";
    private final String homeHeaderText = "Home";
    private final String homePageLeftColumn = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec eu laoreet odio. Donec enim dolor, pulvinar in urna a, sodales dictum libero. In est quam, vehicula ac facilisis ornare, mattis ut lectus. Suspendisse ornare lorem aliquam tempor vulputate. Nullam ut turpis sit amet sem porttitor lacinia. Nam elementum leo consectetur, volutpat ipsum nec, laoreet velit. Cras lacus ex, ornare sit amet lacus at, ultricies imperdiet enim. Sed nibh sem, porta quis semper ac, sagittis id nulla. Aliquam eget nibh ut nibh aliquet ornare vel quis lectus. Integer tincidunt justo lacus, eget pellentesque sapien gravida cursus. Donec et ex eu nulla maximus dignissim suscipit eu metus. Pellentesque ac erat in orci varius volutpat id vitae nunc. In ultrices risus augue. Nulla fermentum, ex laoreet porttitor tempus, nunc lacus sollicitudin massa, vitae tincidunt sem libero et nisl. Sed aliquam orci quis elit finibus, sit amet interdum ipsum tincidunt. ";
    private final String homePageRightColumn = "Duis eu feugiat ipsum. Nam facilisis neque sit amet urna dictum ornare. In efficitur erat eu tortor posuere semper. Morbi rutrum, erat sit amet molestie fermentum, turpis quam aliquam justo, ut varius neque orci non purus. Ut ut leo imperdiet, vestibulum eros nec, tristique eros. Vivamus porttitor sollicitudin velit, eu euismod urna elementum eget. Aenean vulputate feugiat eros vel sagittis. Nulla at finibus risus. Curabitur vitae felis suscipit, luctus massa imperdiet, suscipit risus. Aenean feugiat sed enim a rutrum. Pellentesque feugiat mi ac nisl molestie finibus. Aliquam aliquam arcu a ultricies semper. Maecenas vestibulum orci sed pharetra blandit.";
    private final String tempTemplateAndPrevWorkText = "Proin tortor quam, rhoncus at nulla ultrices, consectetur condimentum elit. Pellentesque dignissim condimentum dolor, nec molestie tellus viverra ut. Integer eu mi quis erat fringilla. ";

    private final String loremIpsumText = "Lorem ipsum dolor sit amet.";
    private final List<String> skillsList = Arrays.asList("Lorem ipsum", "Lorem ipsum", "Lorem ipsum", "Lorem ipsum", "Lorem ipsum", "Lorem ipsum", "Lorem ipsum", "Lorem ipsum", "Lorem ipsum", "Lorem ipsum", "Lorem ipsum", "Lorem ipsum", "Lorem ipsum", "Lorem ipsum", "Lorem ipsum", "Lorem ipsum");
    private final List<String> aboutUsInformation = Arrays.asList("Sed semper tincidunt urna, at suscipit sapien elementum quis. In varius, nibh vitae accumsan ultricies, risus purus lacinia sem, vitae volutpat augue lectus et urna. Ut maximus rhoncus tellus vel lobortis. Aenean ut felis quis magna viverra dignissim sed nec ipsum. Cras fermentum nulla non mauris rhoncus, ac vulputate leo ornare. Aenean venenatis mauris a justo sollicitudin, et egestas ligula porta. Nullam suscipit dignissim justo, non luctus diam feugiat nec. Pellentesque sed odio vel orci tincidunt sollicitudin. Aliquam odio tellus, sodales vitae sem sit amet, varius aliquam enim. Nunc tempor est nulla. Donec dignissim enim at leo aliquam, vitae gravida diam luctus. Quisque tincidunt placerat blandit. Curabitur ligula odio, ullamcorper ut dolor vel, luctus cursus velit. Nam maximus consequat sapien, non interdum massa scelerisque vitae. Mauris et nisl bibendum, fermentum mi et, rhoncus felis. Cras tincidunt rhoncus erat, ac fringilla est malesuada ac.",
            "Duis auctor, ipsum in consectetur egestas, orci leo lobortis magna, id dignissim nibh enim sit amet risus. Vestibulum laoreet lacus at neque molestie, sed interdum orci viverra. Aenean a ante semper, facilisis dolor vitae, consequat velit. Aliquam eget dui eget ligula rhoncus interdum eget eget enim. Curabitur eleifend bibendum quam. Mauris congue lectus et erat lacinia laoreet. Sed nibh massa, iaculis suscipit commodo ut, placerat et est. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos.",
            "Quisque placerat sollicitudin molestie. Nunc eget tellus scelerisque, mattis enim ut, dignissim mi. Maecenas dignissim eleifend sapien sed placerat. Vivamus id aliquam sapien. Aliquam in purus tempor, ultrices lectus ac, molestie velit. Vestibulum ut quam maximus metus sagittis consectetur. In vel vulputate sem. Duis augue ligula, porta sed tempor eu, vehicula placerat magna. Suspendisse ut ex et dolor suscipit luctus et ut arcu. Suspendisse ultrices eros ut augue fringilla sagittis. Duis tincidunt ex a facilisis lobortis. ");

    public String getTempTemplateAndPrevWorkText() {
        return tempTemplateAndPrevWorkText;
    }

    public String getRatesHeaderText() {
        return ratesHeaderText;
    }

    public String getAboutUsHeaderText() {
        return aboutUsHeaderText;
    }

    public String getSkillSetHeaderText() {
        return skillSetHeaderText;
    }

    public String getTemplatePrevWorkHeaderText() {
        return templatePrevWorkHeaderText;
    }

    public String getHomeHeaderText() {
        return homeHeaderText;
    }

    public String getHomePageLeftColumn() {
        return homePageLeftColumn;
    }

    public String getHomePageRightColumn() {
        return homePageRightColumn;
    }

    public String getLoremIpsumText() {
        return loremIpsumText;
    }

    public List<String> getSkillsList() {
        return skillsList;
    }

    public List<String> getAboutUsInformation() {
        return aboutUsInformation;
    }
}
