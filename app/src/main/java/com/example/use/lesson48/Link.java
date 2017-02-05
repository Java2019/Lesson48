package com.example.use.lesson48;

/**
 * Created by use on 05.02.17.
 */
public class Link {
    private String name;
    private String link;
    private int image;

    public static final Link[] links = {
        new Link("Сила невербалики: как дети улавливают наши социальные стереотипы",
                "<a href=https://monocler.ru/deti-sotsialnyie-stereotipyi/><font color=#AAA>Сила невербалики: как дети улавливают наши социальные стереотипы</font></a>",
                R.drawable.boy),

        new Link("Когда человек перестает быть человеком? Мрачный прогноз М. Мамардашвили",
                "https://monocler.ru/antropologicheskaya-katastrofa-mamardashvili/",
                R.drawable.model)
    };

    public Link(String name, String link, int image) {
        this.name = name;
        this.link = link;
        this.image = image;
    }

    @Override
    public String toString() {
        return this.name;
    }

    public Integer getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public String getLink() {
        return link;
    }
}
