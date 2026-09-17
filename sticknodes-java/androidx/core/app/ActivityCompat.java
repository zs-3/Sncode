package androidx.core.app;

/* loaded from: classes.dex */
public class ActivityCompat extends androidx.core.content.ContextCompat {
    private static androidx.core.app.ActivityCompat.PermissionCompatDelegate sDelegate;


    static class Api16Impl {
        static void finishAffinity(android.app.Activity r0) {
                r0.finishAffinity()
                return
        }

        static void startActivityForResult(android.app.Activity r0, android.content.Intent r1, int r2, android.os.Bundle r3) {
                r0.startActivityForResult(r1, r2, r3)
                return
        }

        static void startIntentSenderForResult(android.app.Activity r0, android.content.IntentSender r1, int r2, android.content.Intent r3, int r4, int r5, int r6, android.os.Bundle r7) throws android.content.IntentSender.SendIntentException {
                r0.startIntentSenderForResult(r1, r2, r3, r4, r5, r6, r7)
                return
        }
    }

    static class Api21Impl {
        static void finishAfterTransition(android.app.Activity r0) {
                r0.finishAfterTransition()
                return
        }

        static void postponeEnterTransition(android.app.Activity r0) {
                r0.postponeEnterTransition()
                return
        }

        static void setEnterSharedElementCallback(android.app.Activity r0, android.app.SharedElementCallback r1) {
                r0.setEnterSharedElementCallback(r1)
                return
        }

        static void setExitSharedElementCallback(android.app.Activity r0, android.app.SharedElementCallback r1) {
                r0.setExitSharedElementCallback(r1)
                return
        }

        static void startPostponedEnterTransition(android.app.Activity r0) {
                r0.startPostponedEnterTransition()
                return
        }
    }

    static class Api23Impl {
        static void onSharedElementsReady(java.lang.Object r0) {
                android.app.SharedElementCallback$OnSharedElementsReadyListener r0 = (android.app.SharedElementCallback.OnSharedElementsReadyListener) r0
                r0.onSharedElementsReady()
                return
        }

        static void requestPermissions(android.app.Activity r0, java.lang.String[] r1, int r2) {
                r0.requestPermissions(r1, r2)
                return
        }

        static boolean shouldShowRequestPermissionRationale(android.app.Activity r0, java.lang.String r1) {
                boolean r0 = r0.shouldShowRequestPermissionRationale(r1)
                return r0
        }
    }

    public interface OnRequestPermissionsResultCallback {
        void onRequestPermissionsResult(int r1, java.lang.String[] r2, int[] r3);
    }

    public interface PermissionCompatDelegate {
        boolean requestPermissions(android.app.Activity r1, java.lang.String[] r2, int r3);
    }

    public interface RequestPermissionsRequestCodeValidator {
        void validateRequestPermissionsRequestCode(int r1);
    }

    public static void finishAfterTransition(android.app.Activity r0) {
            androidx.core.app.ActivityCompat.Api21Impl.finishAfterTransition(r0)
            return
    }

    public static void postponeEnterTransition(android.app.Activity r0) {
            androidx.core.app.ActivityCompat.Api21Impl.postponeEnterTransition(r0)
            return
    }

    public static void requestPermissions(android.app.Activity r6, java.lang.String[] r7, int r8) {
            androidx.core.app.ActivityCompat$PermissionCompatDelegate r0 = androidx.core.app.ActivityCompat.sDelegate
            if (r0 == 0) goto Lb
            boolean r0 = r0.requestPermissions(r6, r7, r8)
            if (r0 == 0) goto Lb
            return
        Lb:
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r1 = 0
            r2 = 0
        L12:
            int r3 = r7.length
            if (r2 >= r3) goto L57
            r3 = r7[r2]
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L37
            boolean r3 = androidx.core.os.BuildCompat.isAtLeastT()
            if (r3 != 0) goto L34
            r3 = r7[r2]
            java.lang.String r4 = "android.permission.POST_NOTIFICATIONS"
            boolean r3 = android.text.TextUtils.equals(r3, r4)
            if (r3 == 0) goto L34
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r0.add(r3)
        L34:
            int r2 = r2 + 1
            goto L12
        L37:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "Permission request for permissions "
            r8.append(r0)
            java.lang.String r7 = java.util.Arrays.toString(r7)
            r8.append(r7)
            java.lang.String r7 = " must not contain null or empty values"
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            r6.<init>(r7)
            throw r6
        L57:
            int r2 = r0.size()
            if (r2 <= 0) goto L62
            int r3 = r7.length
            int r3 = r3 - r2
            java.lang.String[] r3 = new java.lang.String[r3]
            goto L63
        L62:
            r3 = r7
        L63:
            if (r2 <= 0) goto L81
            int r4 = r7.length
            if (r2 != r4) goto L69
            return
        L69:
            r2 = 0
        L6a:
            int r4 = r7.length
            if (r1 >= r4) goto L81
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            boolean r4 = r0.contains(r4)
            if (r4 != 0) goto L7e
            int r4 = r2 + 1
            r5 = r7[r1]
            r3[r2] = r5
            r2 = r4
        L7e:
            int r1 = r1 + 1
            goto L6a
        L81:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto L95
            boolean r0 = r6 instanceof androidx.core.app.ActivityCompat.RequestPermissionsRequestCodeValidator
            if (r0 == 0) goto L91
            r0 = r6
            androidx.core.app.ActivityCompat$RequestPermissionsRequestCodeValidator r0 = (androidx.core.app.ActivityCompat.RequestPermissionsRequestCodeValidator) r0
            r0.validateRequestPermissionsRequestCode(r8)
        L91:
            androidx.core.app.ActivityCompat.Api23Impl.requestPermissions(r6, r7, r8)
            goto Laa
        L95:
            boolean r7 = r6 instanceof androidx.core.app.ActivityCompat.OnRequestPermissionsResultCallback
            if (r7 == 0) goto Laa
            android.os.Handler r7 = new android.os.Handler
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r7.<init>(r0)
            androidx.core.app.ActivityCompat$1 r0 = new androidx.core.app.ActivityCompat$1
            r0.<init>(r3, r6, r8)
            r7.post(r0)
        Laa:
            return
    }

    public static void setEnterSharedElementCallback(android.app.Activity r0, androidx.core.app.SharedElementCallback r1) {
            r1 = 0
            androidx.core.app.ActivityCompat.Api21Impl.setEnterSharedElementCallback(r0, r1)
            return
    }

    public static void setExitSharedElementCallback(android.app.Activity r0, androidx.core.app.SharedElementCallback r1) {
            r1 = 0
            androidx.core.app.ActivityCompat.Api21Impl.setExitSharedElementCallback(r0, r1)
            return
    }

    public static boolean shouldShowRequestPermissionRationale(android.app.Activity r3, java.lang.String r4) {
            boolean r0 = androidx.core.os.BuildCompat.isAtLeastT()
            r1 = 0
            if (r0 != 0) goto L10
            java.lang.String r0 = "android.permission.POST_NOTIFICATIONS"
            boolean r0 = android.text.TextUtils.equals(r0, r4)
            if (r0 == 0) goto L10
            return r1
        L10:
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 23
            if (r0 < r2) goto L1b
            boolean r3 = androidx.core.app.ActivityCompat.Api23Impl.shouldShowRequestPermissionRationale(r3, r4)
            return r3
        L1b:
            return r1
    }

    public static void startActivityForResult(android.app.Activity r0, android.content.Intent r1, int r2, android.os.Bundle r3) {
            androidx.core.app.ActivityCompat.Api16Impl.startActivityForResult(r0, r1, r2, r3)
            return
    }

    public static void startIntentSenderForResult(android.app.Activity r0, android.content.IntentSender r1, int r2, android.content.Intent r3, int r4, int r5, int r6, android.os.Bundle r7) throws android.content.IntentSender.SendIntentException {
            androidx.core.app.ActivityCompat.Api16Impl.startIntentSenderForResult(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static void startPostponedEnterTransition(android.app.Activity r0) {
            androidx.core.app.ActivityCompat.Api21Impl.startPostponedEnterTransition(r0)
            return
    }
}
