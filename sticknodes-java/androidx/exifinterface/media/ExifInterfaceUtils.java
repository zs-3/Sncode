package androidx.exifinterface.media;

/* loaded from: classes.dex */
class ExifInterfaceUtils {

    static class Api21Impl {
        static void close(java.io.FileDescriptor r0) throws android.system.ErrnoException {
                android.system.Os.close(r0)
                return
        }

        static java.io.FileDescriptor dup(java.io.FileDescriptor r0) throws android.system.ErrnoException {
                java.io.FileDescriptor r0 = android.system.Os.dup(r0)
                return r0
        }

        static long lseek(java.io.FileDescriptor r0, long r1, int r3) throws android.system.ErrnoException {
                long r0 = android.system.Os.lseek(r0, r1, r3)
                return r0
        }
    }

    static class Api23Impl {
        static void setDataSource(android.media.MediaMetadataRetriever r0, android.media.MediaDataSource r1) {
                r0.setDataSource(r1)
                return
        }
    }

    static long[] convertToLongArray(java.lang.Object r4) {
            boolean r0 = r4 instanceof int[]
            if (r0 == 0) goto L16
            int[] r4 = (int[]) r4
            int r0 = r4.length
            long[] r0 = new long[r0]
            r1 = 0
        La:
            int r2 = r4.length
            if (r1 >= r2) goto L15
            r2 = r4[r1]
            long r2 = (long) r2
            r0[r1] = r2
            int r1 = r1 + 1
            goto La
        L15:
            return r0
        L16:
            boolean r0 = r4 instanceof long[]
            if (r0 == 0) goto L1d
            long[] r4 = (long[]) r4
            return r4
        L1d:
            r4 = 0
            return r4
    }

    static boolean startsWith(byte[] r4, byte[] r5) {
            r0 = 0
            if (r4 == 0) goto L1b
            if (r5 != 0) goto L6
            goto L1b
        L6:
            int r1 = r4.length
            int r2 = r5.length
            if (r1 >= r2) goto Lb
            return r0
        Lb:
            r1 = 0
        Lc:
            int r2 = r5.length
            if (r1 >= r2) goto L19
            r2 = r4[r1]
            r3 = r5[r1]
            if (r2 == r3) goto L16
            return r0
        L16:
            int r1 = r1 + 1
            goto Lc
        L19:
            r4 = 1
            return r4
        L1b:
            return r0
    }
}
