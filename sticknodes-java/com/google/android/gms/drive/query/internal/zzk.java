package com.google.android.gms.drive.query.internal;

/* loaded from: classes.dex */
public final class zzk implements com.google.android.gms.drive.query.internal.zzj<java.lang.Boolean> {
    private java.lang.Boolean zzmm;

    private zzk() {
            r1 = this;
            r1.<init>()
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r1.zzmm = r0
            return
    }

    public static boolean zza(com.google.android.gms.drive.query.Filter r1) {
            if (r1 != 0) goto L4
            r1 = 0
            return r1
        L4:
            com.google.android.gms.drive.query.internal.zzk r0 = new com.google.android.gms.drive.query.internal.zzk
            r0.<init>()
            java.lang.Object r1 = r1.zza(r0)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            return r1
    }

    @Override // com.google.android.gms.drive.query.internal.zzj
    public final /* synthetic */ java.lang.Boolean zza(com.google.android.gms.drive.metadata.zzb r1, java.lang.Object r2) {
            r0 = this;
            java.lang.Boolean r1 = r0.zzmm
            return r1
    }

    @Override // com.google.android.gms.drive.query.internal.zzj
    public final /* synthetic */ java.lang.Boolean zza(com.google.android.gms.drive.query.internal.zzx r1, com.google.android.gms.drive.metadata.MetadataField r2, java.lang.Object r3) {
            r0 = this;
            java.lang.Boolean r1 = r0.zzmm
            return r1
    }

    @Override // com.google.android.gms.drive.query.internal.zzj
    public final /* synthetic */ java.lang.Boolean zza(com.google.android.gms.drive.query.internal.zzx r1, java.util.List<java.lang.Boolean> r2) {
            r0 = this;
            java.lang.Boolean r1 = r0.zzmm
            return r1
    }

    @Override // com.google.android.gms.drive.query.internal.zzj
    public final /* synthetic */ java.lang.Boolean zza(java.lang.Boolean r1) {
            r0 = this;
            java.lang.Boolean r1 = r0.zzmm
            return r1
    }

    @Override // com.google.android.gms.drive.query.internal.zzj
    public final /* synthetic */ java.lang.Boolean zzbj() {
            r1 = this;
            java.lang.Boolean r0 = r1.zzmm
            return r0
    }

    @Override // com.google.android.gms.drive.query.internal.zzj
    public final /* synthetic */ java.lang.Boolean zzbk() {
            r1 = this;
            java.lang.Boolean r0 = r1.zzmm
            return r0
    }

    @Override // com.google.android.gms.drive.query.internal.zzj
    public final /* synthetic */ java.lang.Boolean zzc(com.google.android.gms.drive.metadata.MetadataField r1, java.lang.Object r2) {
            r0 = this;
            java.lang.Boolean r1 = r0.zzmm
            return r1
    }

    @Override // com.google.android.gms.drive.query.internal.zzj
    public final /* synthetic */ java.lang.Boolean zze(com.google.android.gms.drive.metadata.MetadataField r1) {
            r0 = this;
            java.lang.Boolean r1 = r0.zzmm
            return r1
    }

    @Override // com.google.android.gms.drive.query.internal.zzj
    public final /* synthetic */ java.lang.Boolean zzi(java.lang.String r1) {
            r0 = this;
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto La
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r0.zzmm = r1
        La:
            java.lang.Boolean r1 = r0.zzmm
            return r1
    }
}
