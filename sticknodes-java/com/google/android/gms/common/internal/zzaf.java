package com.google.android.gms.common.internal;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* loaded from: classes.dex */
public abstract class zzaf extends com.google.android.gms.internal.common.zzb implements com.google.android.gms.common.internal.zzag {
    public static com.google.android.gms.common.internal.zzag zzb(android.os.IBinder r2) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            java.lang.String r0 = "com.google.android.gms.common.internal.IGoogleCertificatesApi"
            android.os.IInterface r0 = r2.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.gms.common.internal.zzag
            if (r1 == 0) goto L11
            com.google.android.gms.common.internal.zzag r0 = (com.google.android.gms.common.internal.zzag) r0
            return r0
        L11:
            com.google.android.gms.common.internal.zzae r0 = new com.google.android.gms.common.internal.zzae
            r0.<init>(r2)
            return r0
    }
}
