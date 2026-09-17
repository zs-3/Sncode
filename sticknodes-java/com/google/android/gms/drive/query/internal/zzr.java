package com.google.android.gms.drive.query.internal;

@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "LogicalFilterCreator")
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved({1000})
/* loaded from: classes.dex */
public final class zzr extends com.google.android.gms.drive.query.internal.zza {
    public static final android.os.Parcelable.Creator<com.google.android.gms.drive.query.internal.zzr> CREATOR = null;
    private java.util.List<com.google.android.gms.drive.query.Filter> zzls;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 1)
    private final com.google.android.gms.drive.query.internal.zzx zzlz;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 2)
    private final java.util.List<com.google.android.gms.drive.query.internal.FilterHolder> zzmo;

    static {
            com.google.android.gms.drive.query.internal.zzs r0 = new com.google.android.gms.drive.query.internal.zzs
            r0.<init>()
            com.google.android.gms.drive.query.internal.zzr.CREATOR = r0
            return
    }

    public zzr(com.google.android.gms.drive.query.internal.zzx r4, com.google.android.gms.drive.query.Filter r5, com.google.android.gms.drive.query.Filter... r6) {
            r3 = this;
            r3.<init>()
            r3.zzlz = r4
            java.util.ArrayList r4 = new java.util.ArrayList
            int r0 = r6.length
            int r0 = r0 + 1
            r4.<init>(r0)
            r3.zzmo = r4
            com.google.android.gms.drive.query.internal.FilterHolder r0 = new com.google.android.gms.drive.query.internal.FilterHolder
            r0.<init>(r5)
            r4.add(r0)
            java.util.ArrayList r4 = new java.util.ArrayList
            int r0 = r6.length
            int r0 = r0 + 1
            r4.<init>(r0)
            r3.zzls = r4
            r4.add(r5)
            int r4 = r6.length
            r5 = 0
        L26:
            if (r5 >= r4) goto L3c
            r0 = r6[r5]
            java.util.List<com.google.android.gms.drive.query.internal.FilterHolder> r1 = r3.zzmo
            com.google.android.gms.drive.query.internal.FilterHolder r2 = new com.google.android.gms.drive.query.internal.FilterHolder
            r2.<init>(r0)
            r1.add(r2)
            java.util.List<com.google.android.gms.drive.query.Filter> r1 = r3.zzls
            r1.add(r0)
            int r5 = r5 + 1
            goto L26
        L3c:
            return
    }

    public zzr(com.google.android.gms.drive.query.internal.zzx r3, java.lang.Iterable<com.google.android.gms.drive.query.Filter> r4) {
            r2 = this;
            r2.<init>()
            r2.zzlz = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.zzls = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.zzmo = r3
            java.util.Iterator r3 = r4.iterator()
        L17:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L33
            java.lang.Object r4 = r3.next()
            com.google.android.gms.drive.query.Filter r4 = (com.google.android.gms.drive.query.Filter) r4
            java.util.List<com.google.android.gms.drive.query.Filter> r0 = r2.zzls
            r0.add(r4)
            java.util.List<com.google.android.gms.drive.query.internal.FilterHolder> r0 = r2.zzmo
            com.google.android.gms.drive.query.internal.FilterHolder r1 = new com.google.android.gms.drive.query.internal.FilterHolder
            r1.<init>(r4)
            r0.add(r1)
            goto L17
        L33:
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    zzr(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) com.google.android.gms.drive.query.internal.zzx r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) java.util.List<com.google.android.gms.drive.query.internal.FilterHolder> r2) {
            r0 = this;
            r0.<init>()
            r0.zzlz = r1
            r0.zzmo = r2
            return
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r5, int r6) {
            r4 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r5)
            com.google.android.gms.drive.query.internal.zzx r1 = r4.zzlz
            r2 = 1
            r3 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            java.util.List<com.google.android.gms.drive.query.internal.FilterHolder> r6 = r4.zzmo
            r1 = 2
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(r5, r1, r6, r3)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r5, r0)
            return
    }

    @Override // com.google.android.gms.drive.query.Filter
    public final <T> T zza(com.google.android.gms.drive.query.internal.zzj<T> r4) {
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List<com.google.android.gms.drive.query.internal.FilterHolder> r1 = r3.zzmo
            java.util.Iterator r1 = r1.iterator()
        Lb:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L23
            java.lang.Object r2 = r1.next()
            com.google.android.gms.drive.query.internal.FilterHolder r2 = (com.google.android.gms.drive.query.internal.FilterHolder) r2
            com.google.android.gms.drive.query.Filter r2 = r2.getFilter()
            java.lang.Object r2 = r2.zza(r4)
            r0.add(r2)
            goto Lb
        L23:
            com.google.android.gms.drive.query.internal.zzx r1 = r3.zzlz
            java.lang.Object r4 = r4.zza(r1, r0)
            return r4
    }
}
