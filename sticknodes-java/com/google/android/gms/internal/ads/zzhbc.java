package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzhcp;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzhbc<ContainingType extends com.google.android.gms.internal.ads.zzhcp, Type> extends com.google.android.gms.internal.ads.zzham<ContainingType, Type> {
    zzhbc(com.google.android.gms.internal.ads.zzhcp r1, java.lang.Object r2, com.google.android.gms.internal.ads.zzhcp r3, com.google.android.gms.internal.ads.zzhbb r4, java.lang.Class r5) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto L17
            com.google.android.gms.internal.ads.zzhel r1 = r4.zzb
            com.google.android.gms.internal.ads.zzhel r2 = com.google.android.gms.internal.ads.zzhel.zzk
            if (r1 != r2) goto L16
            if (r3 == 0) goto Le
            goto L16
        Le:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Null messageDefaultInstance"
            r1.<init>(r2)
            throw r1
        L16:
            return
        L17:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Null containingTypeDefaultInstance"
            r1.<init>(r2)
            throw r1
    }
}
