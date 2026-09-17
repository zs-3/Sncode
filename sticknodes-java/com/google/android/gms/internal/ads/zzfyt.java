package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzfyt {
    public static com.google.android.gms.internal.ads.zzfyp zza(com.google.android.gms.internal.ads.zzfyp r1) {
            boolean r0 = r1 instanceof com.google.android.gms.internal.ads.zzfys
            if (r0 != 0) goto L19
            boolean r0 = r1 instanceof com.google.android.gms.internal.ads.zzfyq
            if (r0 == 0) goto L9
            goto L19
        L9:
            boolean r0 = r1 instanceof java.io.Serializable
            if (r0 == 0) goto L13
            com.google.android.gms.internal.ads.zzfyq r0 = new com.google.android.gms.internal.ads.zzfyq
            r0.<init>(r1)
            goto L18
        L13:
            com.google.android.gms.internal.ads.zzfys r0 = new com.google.android.gms.internal.ads.zzfys
            r0.<init>(r1)
        L18:
            return r0
        L19:
            return r1
    }
}
