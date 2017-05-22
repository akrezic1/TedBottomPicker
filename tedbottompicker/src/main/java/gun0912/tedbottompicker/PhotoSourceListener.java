package gun0912.tedbottompicker;

/**
 * Listener for custom camera and gallery intents, it makes it easier to replace already implemented
 * screens for choosing images with bottom picker.
 */

public interface PhotoSourceListener {

    void openCamera();

    void openGallery();

}
