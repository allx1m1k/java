package com.lux.assignment;

/**
 * Created by dima on 12.08.2014.
 */
public class HtmlSourceImpl {
    private String path; //входной url
    private byte[] is; //массив байтов текста из входного url

    /**
     * Конструктор
     *
     * @param pathToSource путь к файлу
     */
    public HtmlSourceImpl(String pathToSource) {
        this.path = pathToSource;
    }
}
