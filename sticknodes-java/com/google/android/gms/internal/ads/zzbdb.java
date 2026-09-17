package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
@java.lang.Deprecated
/* loaded from: classes.dex */
public final class zzbdb {
    public zzbdb() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final void zza(com.google.android.gms.internal.ads.zzbda r3, com.google.android.gms.internal.ads.zzbcy r4) {
            android.content.Context r0 = r4.zza()
            if (r0 == 0) goto L2c
            java.lang.String r0 = r4.zzb()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L24
            android.content.Context r0 = r4.zza()
            java.lang.String r1 = r4.zzb()
            java.lang.String r2 = r4.zzc()
            java.util.Map r4 = r4.zzd()
            r3.zzd(r0, r1, r2, r4)
            return
        L24:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration."
            r3.<init>(r4)
            throw r3
        L2c:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Context can't be null. Please set up context in CsiConfiguration."
            r3.<init>(r4)
            throw r3
    }
}
