package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.4.0 */
/* loaded from: classes2.dex */
final class zzmo implements java.util.Map.Entry {
    private final java.util.Map.Entry zza;

    /* synthetic */ zzmo(java.util.Map.Entry r1, com.google.android.gms.internal.measurement.zzmq r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getKey() {
            r1 = this;
            java.util.Map$Entry r0 = r1.zza
            java.lang.Object r0 = r0.getKey()
            return r0
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getValue() {
            r2 = this;
            java.util.Map$Entry r0 = r2.zza
            java.lang.Object r0 = r0.getValue()
            com.google.android.gms.internal.measurement.zzmr r0 = (com.google.android.gms.internal.measurement.zzmr) r0
            r1 = 0
            if (r0 != 0) goto Lc
            return r1
        Lc:
            throw r1
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object setValue(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.google.android.gms.internal.measurement.zznh
            if (r0 == 0) goto L13
            java.util.Map$Entry r0 = r1.zza
            java.lang.Object r0 = r0.getValue()
            com.google.android.gms.internal.measurement.zzmr r0 = (com.google.android.gms.internal.measurement.zzmr) r0
            com.google.android.gms.internal.measurement.zznh r2 = (com.google.android.gms.internal.measurement.zznh) r2
            com.google.android.gms.internal.measurement.zznh r2 = r0.zzc(r2)
            return r2
        L13:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite"
            r2.<init>(r0)
            throw r2
    }

    public final com.google.android.gms.internal.measurement.zzmr zza() {
            r1 = this;
            java.util.Map$Entry r0 = r1.zza
            java.lang.Object r0 = r0.getValue()
            com.google.android.gms.internal.measurement.zzmr r0 = (com.google.android.gms.internal.measurement.zzmr) r0
            return r0
    }
}
