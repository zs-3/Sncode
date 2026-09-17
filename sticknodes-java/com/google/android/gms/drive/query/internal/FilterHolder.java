package com.google.android.gms.drive.query.internal;

@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "FilterHolderCreator")
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved({1000})
/* loaded from: classes.dex */
public class FilterHolder extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.drive.query.internal.FilterHolder> CREATOR = null;
    private final com.google.android.gms.drive.query.Filter zzbc;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 1)
    private final com.google.android.gms.drive.query.internal.zzb<?> zzmd;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 2)
    private final com.google.android.gms.drive.query.internal.zzd zzme;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 3)
    private final com.google.android.gms.drive.query.internal.zzr zzmf;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 4)
    private final com.google.android.gms.drive.query.internal.zzv zzmg;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 5)
    private final com.google.android.gms.drive.query.internal.zzp<?> zzmh;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 6)
    private final com.google.android.gms.drive.query.internal.zzt zzmi;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 7)
    private final com.google.android.gms.drive.query.internal.zzn zzmj;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 8)
    private final com.google.android.gms.drive.query.internal.zzl zzmk;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 9)
    private final com.google.android.gms.drive.query.internal.zzz zzml;

    static {
            com.google.android.gms.drive.query.internal.zzh r0 = new com.google.android.gms.drive.query.internal.zzh
            r0.<init>()
            com.google.android.gms.drive.query.internal.FilterHolder.CREATOR = r0
            return
    }

    public FilterHolder(com.google.android.gms.drive.query.Filter r11) {
            r10 = this;
            r10.<init>()
            java.lang.String r0 = "Null filter."
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r11, r0)
            boolean r0 = r11 instanceof com.google.android.gms.drive.query.internal.zzb
            r1 = 0
            if (r0 == 0) goto L11
            r0 = r11
            com.google.android.gms.drive.query.internal.zzb r0 = (com.google.android.gms.drive.query.internal.zzb) r0
            goto L12
        L11:
            r0 = r1
        L12:
            r10.zzmd = r0
            boolean r2 = r11 instanceof com.google.android.gms.drive.query.internal.zzd
            if (r2 == 0) goto L1c
            r2 = r11
            com.google.android.gms.drive.query.internal.zzd r2 = (com.google.android.gms.drive.query.internal.zzd) r2
            goto L1d
        L1c:
            r2 = r1
        L1d:
            r10.zzme = r2
            boolean r3 = r11 instanceof com.google.android.gms.drive.query.internal.zzr
            if (r3 == 0) goto L27
            r3 = r11
            com.google.android.gms.drive.query.internal.zzr r3 = (com.google.android.gms.drive.query.internal.zzr) r3
            goto L28
        L27:
            r3 = r1
        L28:
            r10.zzmf = r3
            boolean r4 = r11 instanceof com.google.android.gms.drive.query.internal.zzv
            if (r4 == 0) goto L32
            r4 = r11
            com.google.android.gms.drive.query.internal.zzv r4 = (com.google.android.gms.drive.query.internal.zzv) r4
            goto L33
        L32:
            r4 = r1
        L33:
            r10.zzmg = r4
            boolean r5 = r11 instanceof com.google.android.gms.drive.query.internal.zzp
            if (r5 == 0) goto L3d
            r5 = r11
            com.google.android.gms.drive.query.internal.zzp r5 = (com.google.android.gms.drive.query.internal.zzp) r5
            goto L3e
        L3d:
            r5 = r1
        L3e:
            r10.zzmh = r5
            boolean r6 = r11 instanceof com.google.android.gms.drive.query.internal.zzt
            if (r6 == 0) goto L48
            r6 = r11
            com.google.android.gms.drive.query.internal.zzt r6 = (com.google.android.gms.drive.query.internal.zzt) r6
            goto L49
        L48:
            r6 = r1
        L49:
            r10.zzmi = r6
            boolean r7 = r11 instanceof com.google.android.gms.drive.query.internal.zzn
            if (r7 == 0) goto L53
            r7 = r11
            com.google.android.gms.drive.query.internal.zzn r7 = (com.google.android.gms.drive.query.internal.zzn) r7
            goto L54
        L53:
            r7 = r1
        L54:
            r10.zzmj = r7
            boolean r8 = r11 instanceof com.google.android.gms.drive.query.internal.zzl
            if (r8 == 0) goto L5e
            r8 = r11
            com.google.android.gms.drive.query.internal.zzl r8 = (com.google.android.gms.drive.query.internal.zzl) r8
            goto L5f
        L5e:
            r8 = r1
        L5f:
            r10.zzmk = r8
            boolean r9 = r11 instanceof com.google.android.gms.drive.query.internal.zzz
            if (r9 == 0) goto L68
            r1 = r11
            com.google.android.gms.drive.query.internal.zzz r1 = (com.google.android.gms.drive.query.internal.zzz) r1
        L68:
            r10.zzml = r1
            if (r0 != 0) goto L85
            if (r2 != 0) goto L85
            if (r3 != 0) goto L85
            if (r4 != 0) goto L85
            if (r5 != 0) goto L85
            if (r6 != 0) goto L85
            if (r7 != 0) goto L85
            if (r8 != 0) goto L85
            if (r1 == 0) goto L7d
            goto L85
        L7d:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Invalid filter type."
            r11.<init>(r0)
            throw r11
        L85:
            r10.zzbc = r11
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    FilterHolder(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) com.google.android.gms.drive.query.internal.zzb<?> r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) com.google.android.gms.drive.query.internal.zzd r2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) com.google.android.gms.drive.query.internal.zzr r3, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 4) com.google.android.gms.drive.query.internal.zzv r4, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 5) com.google.android.gms.drive.query.internal.zzp<?> r5, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 6) com.google.android.gms.drive.query.internal.zzt r6, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 7) com.google.android.gms.drive.query.internal.zzn<?> r7, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 8) com.google.android.gms.drive.query.internal.zzl r8, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 9) com.google.android.gms.drive.query.internal.zzz r9) {
            r0 = this;
            r0.<init>()
            r0.zzmd = r1
            r0.zzme = r2
            r0.zzmf = r3
            r0.zzmg = r4
            r0.zzmh = r5
            r0.zzmi = r6
            r0.zzmj = r7
            r0.zzmk = r8
            r0.zzml = r9
            if (r1 == 0) goto L1a
            r0.zzbc = r1
            return
        L1a:
            if (r2 == 0) goto L1f
            r0.zzbc = r2
            return
        L1f:
            if (r3 == 0) goto L24
            r0.zzbc = r3
            return
        L24:
            if (r4 == 0) goto L29
            r0.zzbc = r4
            return
        L29:
            if (r5 == 0) goto L2e
            r0.zzbc = r5
            return
        L2e:
            if (r6 == 0) goto L33
            r0.zzbc = r6
            return
        L33:
            if (r7 == 0) goto L38
            r0.zzbc = r7
            return
        L38:
            if (r8 == 0) goto L3d
            r0.zzbc = r8
            return
        L3d:
            if (r9 == 0) goto L42
            r0.zzbc = r9
            return
        L42:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "At least one filter must be set."
            r1.<init>(r2)
            throw r1
    }

    public final com.google.android.gms.drive.query.Filter getFilter() {
            r1 = this;
            com.google.android.gms.drive.query.Filter r0 = r1.zzbc
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r5, int r6) {
            r4 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r5)
            com.google.android.gms.drive.query.internal.zzb<?> r1 = r4.zzmd
            r2 = 1
            r3 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            com.google.android.gms.drive.query.internal.zzd r1 = r4.zzme
            r2 = 2
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            com.google.android.gms.drive.query.internal.zzr r1 = r4.zzmf
            r2 = 3
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            com.google.android.gms.drive.query.internal.zzv r1 = r4.zzmg
            r2 = 4
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            com.google.android.gms.drive.query.internal.zzp<?> r1 = r4.zzmh
            r2 = 5
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            com.google.android.gms.drive.query.internal.zzt r1 = r4.zzmi
            r2 = 6
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            com.google.android.gms.drive.query.internal.zzn r1 = r4.zzmj
            r2 = 7
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            com.google.android.gms.drive.query.internal.zzl r1 = r4.zzmk
            r2 = 8
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            com.google.android.gms.drive.query.internal.zzz r1 = r4.zzml
            r2 = 9
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r5, r0)
            return
    }
}
