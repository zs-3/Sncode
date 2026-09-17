package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzkn;
import com.google.android.gms.internal.measurement.zzko;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.4.0 */
/* loaded from: classes2.dex */
public abstract class zzko<MessageType extends com.google.android.gms.internal.measurement.zzko<MessageType, BuilderType>, BuilderType extends com.google.android.gms.internal.measurement.zzkn<MessageType, BuilderType>> implements com.google.android.gms.internal.measurement.zznh {
    protected int zza;

    public zzko() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.zza = r0
            return
    }

    protected static void zzcc(java.lang.Iterable r0, java.util.List r1) {
            com.google.android.gms.internal.measurement.zzkn.zzaW(r0, r1)
            return
    }

    int zzca(com.google.android.gms.internal.measurement.zzns r1) {
            r0 = this;
            r1 = 0
            throw r1
    }

    @Override // com.google.android.gms.internal.measurement.zznh
    public final com.google.android.gms.internal.measurement.zzld zzcb() {
            r5 = this;
            int r0 = r5.zzcf()     // Catch: java.io.IOException -> L1c
            com.google.android.gms.internal.measurement.zzld r1 = com.google.android.gms.internal.measurement.zzld.zzb     // Catch: java.io.IOException -> L1c
            byte[] r1 = new byte[r0]     // Catch: java.io.IOException -> L1c
            int r2 = com.google.android.gms.internal.measurement.zzlk.zzb     // Catch: java.io.IOException -> L1c
            com.google.android.gms.internal.measurement.zzlh r2 = new com.google.android.gms.internal.measurement.zzlh     // Catch: java.io.IOException -> L1c
            r3 = 0
            r2.<init>(r1, r3, r0)     // Catch: java.io.IOException -> L1c
            r5.zzcB(r2)     // Catch: java.io.IOException -> L1c
            r2.zzB()     // Catch: java.io.IOException -> L1c
            com.google.android.gms.internal.measurement.zzlb r0 = new com.google.android.gms.internal.measurement.zzlb     // Catch: java.io.IOException -> L1c
            r0.<init>(r1)     // Catch: java.io.IOException -> L1c
            return r0
        L1c:
            r0 = move-exception
            java.lang.Class r1 = r5.getClass()
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r1 = r1.getName()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Serializing "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = " to a ByteString threw an IOException (should never happen)."
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1, r0)
            throw r2
    }

    public final byte[] zzcd() {
            r5 = this;
            int r0 = r5.zzcf()     // Catch: java.io.IOException -> L15
            byte[] r1 = new byte[r0]     // Catch: java.io.IOException -> L15
            int r2 = com.google.android.gms.internal.measurement.zzlk.zzb     // Catch: java.io.IOException -> L15
            com.google.android.gms.internal.measurement.zzlh r2 = new com.google.android.gms.internal.measurement.zzlh     // Catch: java.io.IOException -> L15
            r3 = 0
            r2.<init>(r1, r3, r0)     // Catch: java.io.IOException -> L15
            r5.zzcB(r2)     // Catch: java.io.IOException -> L15
            r2.zzB()     // Catch: java.io.IOException -> L15
            return r1
        L15:
            r0 = move-exception
            java.lang.Class r1 = r5.getClass()
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r1 = r1.getName()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Serializing "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = " to a byte array threw an IOException (should never happen)."
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1, r0)
            throw r2
    }
}
