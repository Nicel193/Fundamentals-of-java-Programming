package Task_1;

import java.util.Arrays;

public abstract class WritableDoctor extends Doctor {
    protected String folder_path = "task1/";
    protected Reception[] receptios = {};

    WritableDoctor(String surname, int experience) {
        super(surname, experience);
    }

    @Override
    public Reception[] get_receptions() {
        return receptios;
    }

    @Override
    public int get_receptions_count() {
        return receptios.length;
    }

    @Override
    public void add_reception(Reception new_reception) {
        Reception[] new_arr = Arrays.copyOf(receptios, get_receptions_count() + 1);

        new_arr[get_receptions_count()] = new_reception;

        receptios = new_arr;
    }

    protected String get_path(String filename, String format) {
        String path_to_file = folder_path;
        if (filename == null) path_to_file = path_to_file + get_surname() + format;
        else path_to_file += filename;

        return path_to_file;
    }

    public abstract void read_file(String filename);

    public abstract void write_to_file(String filename);
}
