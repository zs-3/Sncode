package kotlin;

/* compiled from: KotlinVersion.kt */
/* loaded from: classes2.dex */
public final class KotlinVersion implements java.lang.Comparable<kotlin.KotlinVersion> {
    public static final kotlin.KotlinVersion CURRENT = null;
    public static final kotlin.KotlinVersion.Companion Companion = null;
    private final int major;
    private final int minor;
    private final int patch;
    private final int version;

    /* compiled from: KotlinVersion.kt */
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            kotlin.KotlinVersion$Companion r0 = new kotlin.KotlinVersion$Companion
            r1 = 0
            r0.<init>(r1)
            kotlin.KotlinVersion.Companion = r0
            kotlin.KotlinVersion r0 = kotlin.KotlinVersionCurrentValue.get()
            kotlin.KotlinVersion.CURRENT = r0
            return
    }

    public KotlinVersion(int r1, int r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.major = r1
            r0.minor = r2
            r0.patch = r3
            int r1 = r0.versionOf(r1, r2, r3)
            r0.version = r1
            return
    }

    private final int versionOf(int r4, int r5, int r6) {
            r3 = this;
            kotlin.ranges.IntRange r0 = new kotlin.ranges.IntRange
            r1 = 0
            r2 = 255(0xff, float:3.57E-43)
            r0.<init>(r1, r2)
            boolean r0 = r0.contains(r4)
            if (r0 == 0) goto L25
            kotlin.ranges.IntRange r0 = new kotlin.ranges.IntRange
            r0.<init>(r1, r2)
            boolean r0 = r0.contains(r5)
            if (r0 == 0) goto L25
            kotlin.ranges.IntRange r0 = new kotlin.ranges.IntRange
            r0.<init>(r1, r2)
            boolean r0 = r0.contains(r6)
            if (r0 == 0) goto L25
            r1 = 1
        L25:
            if (r1 == 0) goto L2e
            int r4 = r4 << 16
            int r5 = r5 << 8
            int r4 = r4 + r5
            int r4 = r4 + r6
            return r4
        L2e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Version components are out of range: "
            r0.append(r1)
            r0.append(r4)
            r4 = 46
            r0.append(r4)
            r0.append(r5)
            r0.append(r4)
            r0.append(r6)
            java.lang.String r4 = r0.toString()
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r4 = r4.toString()
            r5.<init>(r4)
            throw r5
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(kotlin.KotlinVersion r1) {
            r0 = this;
            kotlin.KotlinVersion r1 = (kotlin.KotlinVersion) r1
            int r1 = r0.compareTo2(r1)
            return r1
    }

    /* renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(kotlin.KotlinVersion r2) {
            r1 = this;
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            int r0 = r1.version
            int r2 = r2.version
            int r0 = r0 - r2
            return r0
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof kotlin.KotlinVersion
            if (r1 == 0) goto Lb
            kotlin.KotlinVersion r4 = (kotlin.KotlinVersion) r4
            goto Lc
        Lb:
            r4 = 0
        Lc:
            r1 = 0
            if (r4 != 0) goto L10
            return r1
        L10:
            int r2 = r3.version
            int r4 = r4.version
            if (r2 != r4) goto L17
            goto L18
        L17:
            r0 = 0
        L18:
            return r0
    }

    public int hashCode() {
            r1 = this;
            int r0 = r1.version
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r3.major
            r0.append(r1)
            r1 = 46
            r0.append(r1)
            int r2 = r3.minor
            r0.append(r2)
            r0.append(r1)
            int r1 = r3.patch
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
