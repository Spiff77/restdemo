package com.myapp.demorest.config;

public interface JsonPropertyView {
    public interface Basic {}
    public interface Album extends Basic {}
    public interface Artist extends Basic {}

}


// a view with product basic fields (int, string, etc)
// a view with products having only category
// a view with products having only supplier
// a view with products having everything
