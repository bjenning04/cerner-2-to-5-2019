// cerner_2^5_2019

package com.example;

import com.google.gson.Gson;
import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

public class Main {

    public static void main(final String[] args) throws IOException {
        final Response response = loadObjectFromResource("/response.json", Response.class);
        System.out.println(response);
    }

    /**
     * Loads the given JSON resource file and deserializes it as the specified class.
     *
     * @param filename Resource file to deserialize.
     * @param clazz    Class to deserialize resource file contents as.
     * @param <T>      Deserialized class type.
     * @return The deserialized content of the given JSON resource file.
     * @throws IOException If file does not exist.
     */
    public static <T> T loadObjectFromResource(final String filename, final Class<T> clazz) throws IOException {
        try (final InputStream in = Main.class.getResourceAsStream(filename)) {
            return new Gson().fromJson(IOUtils.toString(in, Charset.defaultCharset()), clazz);
        }
    }

    /**
     * Example data model class for simple response.
     */
    private static class Response {

        private String description;
        private int status;

        public String getDescription() {
            return description;
        }

        public int getStatus() {
            return status;
        }

        @Override
        public String toString() {
            return "Response{description='" + description + "', status=" + status + '}';
        }
    }
}