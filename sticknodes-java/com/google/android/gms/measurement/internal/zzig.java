package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.4.0 */
/* loaded from: classes2.dex */
public final class zzig {
    public static java.lang.String zza(android.content.Context r2) {
            android.content.res.Resources r0 = r2.getResources()     // Catch: android.content.res.Resources.NotFoundException -> Lb
            int r1 = com.google.android.gms.common.R.string.common_google_play_services_unknown_issue     // Catch: android.content.res.Resources.NotFoundException -> Lb
            java.lang.String r2 = r0.getResourcePackageName(r1)     // Catch: android.content.res.Resources.NotFoundException -> Lb
            goto Lf
        Lb:
            java.lang.String r2 = r2.getPackageName()
        Lf:
            return r2
    }

    public static final java.lang.String zzb(java.lang.String r1, android.content.res.Resources r2, java.lang.String r3) {
            java.lang.String r0 = "string"
            int r1 = r2.getIdentifier(r1, r0, r3)
            r3 = 0
            if (r1 != 0) goto La
            goto Le
        La:
            java.lang.String r3 = r2.getString(r1)     // Catch: android.content.res.Resources.NotFoundException -> Le
        Le:
            return r3
    }
}
