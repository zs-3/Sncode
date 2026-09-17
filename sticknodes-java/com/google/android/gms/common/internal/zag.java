package com.google.android.gms.common.internal;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes.dex */
public abstract class zag implements android.content.DialogInterface.OnClickListener {
    public zag() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.android.gms.common.internal.zag zab(android.app.Activity r1, android.content.Intent r2, int r3) {
            com.google.android.gms.common.internal.zad r0 = new com.google.android.gms.common.internal.zad
            r0.<init>(r2, r1, r3)
            return r0
    }

    public static com.google.android.gms.common.internal.zag zac(androidx.fragment.app.Fragment r1, android.content.Intent r2, int r3) {
            com.google.android.gms.common.internal.zae r0 = new com.google.android.gms.common.internal.zae
            r0.<init>(r2, r1, r3)
            return r0
    }

    public static com.google.android.gms.common.internal.zag zad(com.google.android.gms.common.api.internal.LifecycleFragment r1, android.content.Intent r2, int r3) {
            com.google.android.gms.common.internal.zaf r3 = new com.google.android.gms.common.internal.zaf
            r0 = 2
            r3.<init>(r2, r1, r0)
            return r3
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface r5, int r6) {
            r4 = this;
            r4.zaa()     // Catch: java.lang.Throwable -> L4 android.content.ActivityNotFoundException -> L6
            goto L1c
        L4:
            r6 = move-exception
            goto L20
        L6:
            r6 = move-exception
            java.lang.String r0 = "Failed to start resolution intent."
            java.lang.String r1 = "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store."
            java.lang.String r2 = android.os.Build.FINGERPRINT     // Catch: java.lang.Throwable -> L4
            java.lang.String r3 = "generic"
            boolean r2 = r2.contains(r3)     // Catch: java.lang.Throwable -> L4
            r3 = 1
            if (r3 != r2) goto L17
            r0 = r1
        L17:
            java.lang.String r1 = "DialogRedirect"
            android.util.Log.e(r1, r0, r6)     // Catch: java.lang.Throwable -> L4
        L1c:
            r5.dismiss()
            return
        L20:
            r5.dismiss()
            throw r6
    }

    protected abstract void zaa();
}
