package com.google.android.gms.common.internal;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* loaded from: classes.dex */
public final class zzu {
    public static final /* synthetic */ int zza = 0;
    private static final android.net.Uri zzb = null;
    private static final android.net.Uri zzc = null;

    static {
            java.lang.String r0 = "https://plus.google.com/"
            android.net.Uri r0 = android.net.Uri.parse(r0)
            com.google.android.gms.common.internal.zzu.zzb = r0
            android.net.Uri$Builder r0 = r0.buildUpon()
            java.lang.String r1 = "circles"
            android.net.Uri$Builder r0 = r0.appendPath(r1)
            java.lang.String r1 = "find"
            android.net.Uri$Builder r0 = r0.appendPath(r1)
            android.net.Uri r0 = r0.build()
            com.google.android.gms.common.internal.zzu.zzc = r0
            return
    }
}
