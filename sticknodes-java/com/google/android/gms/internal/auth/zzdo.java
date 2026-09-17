package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes.dex */
public final class zzdo {
    public static com.google.android.gms.internal.auth.zzdj zza(com.google.android.gms.internal.auth.zzdj r1) {
            boolean r0 = r1 instanceof com.google.android.gms.internal.auth.zzdm
            if (r0 != 0) goto L19
            boolean r0 = r1 instanceof com.google.android.gms.internal.auth.zzdk
            if (r0 == 0) goto L9
            goto L19
        L9:
            boolean r0 = r1 instanceof java.io.Serializable
            if (r0 == 0) goto L13
            com.google.android.gms.internal.auth.zzdk r0 = new com.google.android.gms.internal.auth.zzdk
            r0.<init>(r1)
            goto L18
        L13:
            com.google.android.gms.internal.auth.zzdm r0 = new com.google.android.gms.internal.auth.zzdm
            r0.<init>(r1)
        L18:
            return r0
        L19:
            return r1
    }

    public static com.google.android.gms.internal.auth.zzdj zzb(java.lang.Object r1) {
            com.google.android.gms.internal.auth.zzdn r0 = new com.google.android.gms.internal.auth.zzdn
            r0.<init>(r1)
            return r0
    }
}
