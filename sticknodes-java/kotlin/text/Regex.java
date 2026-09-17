package kotlin.text;

/* compiled from: Regex.kt */
/* loaded from: classes2.dex */
public final class Regex implements java.io.Serializable {
    public static final kotlin.text.Regex.Companion Companion = null;
    private final java.util.regex.Pattern nativePattern;

    /* compiled from: Regex.kt */
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
            kotlin.text.Regex$Companion r0 = new kotlin.text.Regex$Companion
            r1 = 0
            r0.<init>(r1)
            kotlin.text.Regex.Companion = r0
            return
    }

    public Regex(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "pattern"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)
            java.lang.String r0 = "compile(pattern)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)
            r1.<init>(r2)
            return
    }

    public Regex(java.util.regex.Pattern r2) {
            r1 = this;
            java.lang.String r0 = "nativePattern"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>()
            r1.nativePattern = r2
            return
    }

    public final java.lang.String replace(java.lang.CharSequence r2, java.lang.String r3) {
            r1 = this;
            java.lang.String r0 = "input"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "replacement"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.util.regex.Pattern r0 = r1.nativePattern
            java.util.regex.Matcher r2 = r0.matcher(r2)
            java.lang.String r2 = r2.replaceAll(r3)
            java.lang.String r3 = "nativePattern.matcher(in…).replaceAll(replacement)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            return r2
    }

    public java.lang.String toString() {
            r2 = this;
            java.util.regex.Pattern r0 = r2.nativePattern
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "nativePattern.toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }
}
