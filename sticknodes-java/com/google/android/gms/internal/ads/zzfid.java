package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzfid {
    public static android.os.ParcelFileDescriptor zza(java.io.InputStream r4) throws java.io.IOException {
            android.os.ParcelFileDescriptor[] r0 = android.os.ParcelFileDescriptor.createPipe()
            r1 = 0
            r1 = r0[r1]
            r2 = 1
            r0 = r0[r2]
            com.google.android.gms.internal.ads.zzgfz r2 = com.google.android.gms.internal.ads.zzcan.zza
            com.google.android.gms.internal.ads.zzfic r3 = new com.google.android.gms.internal.ads.zzfic
            r3.<init>(r4, r0)
            r2.execute(r3)
            return r1
    }
}
