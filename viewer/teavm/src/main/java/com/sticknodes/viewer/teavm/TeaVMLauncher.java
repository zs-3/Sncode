package com.sticknodes.viewer.teavm;

import com.github.xpenatan.gdx.backends.teavm.TeaApplication;
import com.github.xpenatan.gdx.backends.teavm.TeaApplicationConfiguration;
import com.sticknodes.viewer.ViewerLauncher;
import org.teavm.jso.JSBody;
import org.teavm.jso.typedarrays.Uint8Array;

public class TeaVMLauncher {
    private static ViewerLauncher viewerInstance;

    public static void main(String[] args) {
        TeaApplicationConfiguration config = new TeaApplicationConfiguration("canvas-container");
        config.width = 0;
        config.height = 0;

        viewerInstance = new ViewerLauncher();
        new TeaApplication(viewerInstance, config);

        setupJSBridge();
    }

    public static ViewerLauncher getViewerInstance() {
        return viewerInstance;
    }

    public static void loadBytesFromJS(Uint8Array array) {
        if (viewerInstance != null && array != null) {
            byte[] bytes = new byte[array.getLength()];
            for (int i = 0; i < bytes.length; i++) {
                bytes[i] = (byte) array.get(i);
            }
            viewerInstance.loadNodesBytes(bytes);
        }
    }

    public static void resetCameraFromJS() {
        if (viewerInstance != null) {
            viewerInstance.resetView();
        }
    }

    @JSBody(params = {}, script =
        "window.StickNodesViewer = {" +
        "  mount: function(target, options) {" +
        "    if (options && options.nodesData) {" +
        "      $rt_globals.com_sticknodes_viewer_teavm_TeaVMLauncher_loadBytesFromJS(options.nodesData);" +
        "    }" +
        "    return {" +
        "      load: function(bytes) { $rt_globals.com_sticknodes_viewer_teavm_TeaVMLauncher_loadBytesFromJS(bytes); }," +
        "      resetView: function() { $rt_globals.com_sticknodes_viewer_teavm_TeaVMLauncher_resetCameraFromJS(); }" +
        "    };" +
        "  }" +
        "};" +
        "window.loadNodesBytes = function(uint8Array) {" +
        "  $rt_globals.com_sticknodes_viewer_teavm_TeaVMLauncher_loadBytesFromJS(uint8Array);" +
        "};" +
        "window.resetViewerCamera = function() {" +
        "  $rt_globals.com_sticknodes_viewer_teavm_TeaVMLauncher_resetCameraFromJS();" +
        "};"
    )
    private static native void setupJSBridge();
}
