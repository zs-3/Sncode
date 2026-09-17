package org.fortheloss.androidcore;

/* loaded from: classes2.dex */
public class StorageInfo {
    public static boolean externalMemoryAvailable() {
            java.lang.String r0 = android.os.Environment.getExternalStorageState()
            java.lang.String r1 = "mounted"
            boolean r0 = r0.equals(r1)
            return r0
    }

    public static long getAvailableExternalMemorySize() {
            boolean r0 = externalMemoryAvailable()
            if (r0 == 0) goto L1e
            java.io.File r0 = android.os.Environment.getExternalStorageDirectory()
            android.os.StatFs r1 = new android.os.StatFs
            java.lang.String r0 = r0.getPath()
            r1.<init>(r0)
            long r2 = r1.getBlockSizeLong()
            long r0 = r1.getAvailableBlocksLong()
            long r0 = r0 * r2
            return r0
        L1e:
            r0 = -1
            return r0
    }
}
