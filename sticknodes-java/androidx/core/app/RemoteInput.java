package androidx.core.app;

/* loaded from: classes.dex */
public final class RemoteInput {

    static class Api20Impl {
        static void addResultsToIntent(java.lang.Object r0, android.content.Intent r1, android.os.Bundle r2) {
                android.app.RemoteInput[] r0 = (android.app.RemoteInput[]) r0
                android.app.RemoteInput.addResultsToIntent(r0, r1, r2)
                return
        }

        public static android.app.RemoteInput fromCompat(androidx.core.app.RemoteInput r0) {
                android.app.RemoteInput$Builder r0 = new android.app.RemoteInput$Builder
                r0 = 0
                throw r0
        }

        static android.os.Bundle getResultsFromIntent(android.content.Intent r0) {
                android.os.Bundle r0 = android.app.RemoteInput.getResultsFromIntent(r0)
                return r0
        }
    }

    static android.app.RemoteInput fromCompat(androidx.core.app.RemoteInput r0) {
            android.app.RemoteInput r0 = androidx.core.app.RemoteInput.Api20Impl.fromCompat(r0)
            return r0
    }

    static android.app.RemoteInput[] fromCompat(androidx.core.app.RemoteInput[] r4) {
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            int r1 = r4.length
            android.app.RemoteInput[] r1 = new android.app.RemoteInput[r1]
            r2 = 0
        L8:
            int r3 = r4.length
            if (r2 >= r3) goto L16
            r3 = r4[r2]
            android.app.RemoteInput r3 = fromCompat(r0)
            r1[r2] = r3
            int r2 = r2 + 1
            goto L8
        L16:
            return r1
    }
}
