package org.fortheloss.androidcore;

/* loaded from: classes2.dex */
public class AndroidPNGEncoder implements org.fortheloss.sticknodes.animationscreen.exporters.IPlatformPNGEncoder {
    private java.lang.String _absoluteDirPath;
    private boolean _appendNumberSuffix;
    private android.content.ContextWrapper _contextWrapperRef;
    private int _fileIndex;
    private java.lang.String _filePrefix;
    private int _height;
    private boolean _isVertical;
    private int _width;

    public AndroidPNGEncoder(android.content.ContextWrapper r3) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2._width = r0
            r2._height = r0
            r2._fileIndex = r0
            r1 = 1
            r2._appendNumberSuffix = r1
            r2._isVertical = r0
            r2._contextWrapperRef = r3
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.exporters.IPlatformPNGEncoder
    public void begin(int r8, int r9, java.lang.String r10, java.lang.String r11, boolean r12) {
            r7 = this;
            r5 = 1
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r6 = r12
            r0.begin(r1, r2, r3, r4, r5, r6)
            return
    }

    public void begin(int r1, int r2, java.lang.String r3, java.lang.String r4, boolean r5, boolean r6) {
            r0 = this;
            r0._width = r1
            r0._height = r2
            r0._absoluteDirPath = r3
            r0._filePrefix = r4
            r0._appendNumberSuffix = r5
            r0._isVertical = r6
            return
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            r0 = 0
            r1._contextWrapperRef = r0
            r1._absoluteDirPath = r0
            r1._filePrefix = r0
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.exporters.IPlatformPNGEncoder
    public boolean isReadyForMorePixels() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // org.fortheloss.sticknodes.animationscreen.exporters.IPlatformPNGEncoder
    public void passPixels(byte[] r12, boolean r13) {
            r11 = this;
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.String r1 = "Received pixels, converting to ARGB int[]..."
            r0.println(r1)
            if (r13 == 0) goto Lf
            int r0 = r12.length
            int r0 = r0 / 4
            int[] r0 = new int[r0]
            goto L14
        Lf:
            int r0 = r12.length
            int r0 = r0 / 3
            int[] r0 = new int[r0]
        L14:
            int r1 = r12.length
            r2 = 0
            r3 = 0
            r4 = 0
        L18:
            if (r3 >= r1) goto L47
            r5 = 255(0xff, float:3.57E-43)
            if (r13 == 0) goto L23
            int r6 = r3 + 1
            r3 = r12[r3]
            goto L26
        L23:
            r6 = r3
            r3 = 255(0xff, float:3.57E-43)
        L26:
            int r7 = r6 + 1
            r6 = r12[r6]
            int r8 = r7 + 1
            r7 = r12[r7]
            int r9 = r8 + 1
            r8 = r12[r8]
            int r10 = r4 + 1
            r3 = r3 & r5
            int r3 = r3 << 24
            r6 = r6 & r5
            int r6 = r6 << 16
            r3 = r3 | r6
            r6 = r7 & 255(0xff, float:3.57E-43)
            int r6 = r6 << 8
            r3 = r3 | r6
            r5 = r5 & r8
            r3 = r3 | r5
            r0[r4] = r3
            r3 = r9
            r4 = r10
            goto L18
        L47:
            boolean r12 = r11._isVertical
            r13 = 1
            if (r12 == 0) goto L77
            int r12 = r0.length
            int[] r12 = new int[r12]
            int r1 = r11._width
            int r1 = r1 - r13
            r3 = 0
        L53:
            if (r1 < 0) goto L6c
            r4 = 0
        L56:
            int r5 = r11._height
            if (r4 >= r5) goto L69
            int r5 = r11._width
            int r5 = r5 * r4
            int r5 = r5 + r1
            int r6 = r3 + 1
            r5 = r0[r5]
            r12[r3] = r5
            int r4 = r4 + 1
            r3 = r6
            goto L56
        L69:
            int r1 = r1 + (-1)
            goto L53
        L6c:
            int r0 = r11._height
            int r1 = r11._width
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r12 = android.graphics.Bitmap.createBitmap(r12, r0, r1, r3)
            goto L81
        L77:
            int r12 = r11._width
            int r1 = r11._height
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r12 = android.graphics.Bitmap.createBitmap(r0, r12, r1, r3)
        L81:
            boolean r0 = r11._appendNumberSuffix
            java.lang.String r1 = ".png"
            if (r0 == 0) goto Lb7
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = r11._filePrefix
            r0.append(r3)
            java.lang.String r3 = "_"
            r0.append(r3)
            java.util.Locale r3 = java.util.Locale.US
            java.lang.Object[] r4 = new java.lang.Object[r13]
            int r5 = r11._fileIndex
            int r6 = r5 + 1
            r11._fileIndex = r6
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4[r2] = r5
            java.lang.String r2 = "%04d"
            java.lang.String r2 = java.lang.String.format(r3, r2, r4)
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            goto Lc8
        Lb7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = r11._filePrefix
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        Lc8:
            java.io.File r1 = new java.io.File
            java.lang.String r2 = r11._absoluteDirPath
            r1.<init>(r2, r0)
            boolean r0 = r1.exists()
            if (r0 != r13) goto Lf7
            java.io.PrintStream r13 = java.lang.System.out
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "(Found file of same name "
            r0.append(r2)
            java.lang.String r2 = r1.getName()
            r0.append(r2)
            java.lang.String r2 = ", deleting."
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r13.println(r0)
            r1.delete()
        Lf7:
            java.io.PrintStream r13 = java.lang.System.out
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Saving PNG to file: "
            r0.append(r2)
            java.lang.String r2 = r1.getAbsolutePath()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r13.println(r0)
            java.io.FileOutputStream r13 = new java.io.FileOutputStream     // Catch: java.lang.Exception -> L12e
            r13.<init>(r1)     // Catch: java.lang.Exception -> L12e
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.PNG     // Catch: java.lang.Exception -> L12e
            r2 = 100
            r12.compress(r0, r2, r13)     // Catch: java.lang.Exception -> L12e
            r13.flush()     // Catch: java.lang.Exception -> L12e
            r13.close()     // Catch: java.lang.Exception -> L12e
            org.fortheloss.framework.IPlatform r12 = org.fortheloss.sticknodes.App.platform     // Catch: java.lang.Exception -> L12e
            java.lang.String r13 = r1.getAbsolutePath()     // Catch: java.lang.Exception -> L12e
            r0 = 0
            r12.saveImageToGallery(r13, r0)     // Catch: java.lang.Exception -> L12e
            goto L137
        L12e:
            r12 = move-exception
            r12.printStackTrace()
            org.fortheloss.framework.IPlatform r13 = org.fortheloss.sticknodes.App.platform
            r13.logNonFatalException(r12)
        L137:
            return
    }
}
