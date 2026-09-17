package org.apache.commons.lang3.arch;

/* loaded from: classes2.dex */
public class Processor {
    private final org.apache.commons.lang3.arch.Processor.Arch arch;
    private final org.apache.commons.lang3.arch.Processor.Type type;

    public enum Arch extends java.lang.Enum<org.apache.commons.lang3.arch.Processor.Arch> {
        private static final /* synthetic */ org.apache.commons.lang3.arch.Processor.Arch[] $VALUES = null;
        public static final org.apache.commons.lang3.arch.Processor.Arch BIT_32 = null;
        public static final org.apache.commons.lang3.arch.Processor.Arch BIT_64 = null;
        public static final org.apache.commons.lang3.arch.Processor.Arch UNKNOWN = null;

        static {
                org.apache.commons.lang3.arch.Processor$Arch r0 = new org.apache.commons.lang3.arch.Processor$Arch
                java.lang.String r1 = "BIT_32"
                r2 = 0
                r0.<init>(r1, r2)
                org.apache.commons.lang3.arch.Processor.Arch.BIT_32 = r0
                org.apache.commons.lang3.arch.Processor$Arch r1 = new org.apache.commons.lang3.arch.Processor$Arch
                java.lang.String r3 = "BIT_64"
                r4 = 1
                r1.<init>(r3, r4)
                org.apache.commons.lang3.arch.Processor.Arch.BIT_64 = r1
                org.apache.commons.lang3.arch.Processor$Arch r3 = new org.apache.commons.lang3.arch.Processor$Arch
                java.lang.String r5 = "UNKNOWN"
                r6 = 2
                r3.<init>(r5, r6)
                org.apache.commons.lang3.arch.Processor.Arch.UNKNOWN = r3
                r5 = 3
                org.apache.commons.lang3.arch.Processor$Arch[] r5 = new org.apache.commons.lang3.arch.Processor.Arch[r5]
                r5[r2] = r0
                r5[r4] = r1
                r5[r6] = r3
                org.apache.commons.lang3.arch.Processor.Arch.$VALUES = r5
                return
        }

        Arch(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static org.apache.commons.lang3.arch.Processor.Arch valueOf(java.lang.String r1) {
                java.lang.Class<org.apache.commons.lang3.arch.Processor$Arch> r0 = org.apache.commons.lang3.arch.Processor.Arch.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                org.apache.commons.lang3.arch.Processor$Arch r1 = (org.apache.commons.lang3.arch.Processor.Arch) r1
                return r1
        }

        public static org.apache.commons.lang3.arch.Processor.Arch[] values() {
                org.apache.commons.lang3.arch.Processor$Arch[] r0 = org.apache.commons.lang3.arch.Processor.Arch.$VALUES
                java.lang.Object r0 = r0.clone()
                org.apache.commons.lang3.arch.Processor$Arch[] r0 = (org.apache.commons.lang3.arch.Processor.Arch[]) r0
                return r0
        }
    }

    public enum Type extends java.lang.Enum<org.apache.commons.lang3.arch.Processor.Type> {
        private static final /* synthetic */ org.apache.commons.lang3.arch.Processor.Type[] $VALUES = null;
        public static final org.apache.commons.lang3.arch.Processor.Type IA_64 = null;
        public static final org.apache.commons.lang3.arch.Processor.Type PPC = null;
        public static final org.apache.commons.lang3.arch.Processor.Type UNKNOWN = null;
        public static final org.apache.commons.lang3.arch.Processor.Type X86 = null;

        static {
                org.apache.commons.lang3.arch.Processor$Type r0 = new org.apache.commons.lang3.arch.Processor$Type
                java.lang.String r1 = "X86"
                r2 = 0
                r0.<init>(r1, r2)
                org.apache.commons.lang3.arch.Processor.Type.X86 = r0
                org.apache.commons.lang3.arch.Processor$Type r1 = new org.apache.commons.lang3.arch.Processor$Type
                java.lang.String r3 = "IA_64"
                r4 = 1
                r1.<init>(r3, r4)
                org.apache.commons.lang3.arch.Processor.Type.IA_64 = r1
                org.apache.commons.lang3.arch.Processor$Type r3 = new org.apache.commons.lang3.arch.Processor$Type
                java.lang.String r5 = "PPC"
                r6 = 2
                r3.<init>(r5, r6)
                org.apache.commons.lang3.arch.Processor.Type.PPC = r3
                org.apache.commons.lang3.arch.Processor$Type r5 = new org.apache.commons.lang3.arch.Processor$Type
                java.lang.String r7 = "UNKNOWN"
                r8 = 3
                r5.<init>(r7, r8)
                org.apache.commons.lang3.arch.Processor.Type.UNKNOWN = r5
                r7 = 4
                org.apache.commons.lang3.arch.Processor$Type[] r7 = new org.apache.commons.lang3.arch.Processor.Type[r7]
                r7[r2] = r0
                r7[r4] = r1
                r7[r6] = r3
                r7[r8] = r5
                org.apache.commons.lang3.arch.Processor.Type.$VALUES = r7
                return
        }

        Type(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static org.apache.commons.lang3.arch.Processor.Type valueOf(java.lang.String r1) {
                java.lang.Class<org.apache.commons.lang3.arch.Processor$Type> r0 = org.apache.commons.lang3.arch.Processor.Type.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                org.apache.commons.lang3.arch.Processor$Type r1 = (org.apache.commons.lang3.arch.Processor.Type) r1
                return r1
        }

        public static org.apache.commons.lang3.arch.Processor.Type[] values() {
                org.apache.commons.lang3.arch.Processor$Type[] r0 = org.apache.commons.lang3.arch.Processor.Type.$VALUES
                java.lang.Object r0 = r0.clone()
                org.apache.commons.lang3.arch.Processor$Type[] r0 = (org.apache.commons.lang3.arch.Processor.Type[]) r0
                return r0
        }
    }

    public Processor(org.apache.commons.lang3.arch.Processor.Arch r1, org.apache.commons.lang3.arch.Processor.Type r2) {
            r0 = this;
            r0.<init>()
            r0.arch = r1
            r0.type = r2
            return
    }

    public org.apache.commons.lang3.arch.Processor.Arch getArch() {
            r1 = this;
            org.apache.commons.lang3.arch.Processor$Arch r0 = r1.arch
            return r0
    }

    public org.apache.commons.lang3.arch.Processor.Type getType() {
            r1 = this;
            org.apache.commons.lang3.arch.Processor$Type r0 = r1.type
            return r0
    }

    public boolean is32Bit() {
            r2 = this;
            org.apache.commons.lang3.arch.Processor$Arch r0 = org.apache.commons.lang3.arch.Processor.Arch.BIT_32
            org.apache.commons.lang3.arch.Processor$Arch r1 = r2.arch
            boolean r0 = r0.equals(r1)
            return r0
    }

    public boolean is64Bit() {
            r2 = this;
            org.apache.commons.lang3.arch.Processor$Arch r0 = org.apache.commons.lang3.arch.Processor.Arch.BIT_64
            org.apache.commons.lang3.arch.Processor$Arch r1 = r2.arch
            boolean r0 = r0.equals(r1)
            return r0
    }

    public boolean isIA64() {
            r2 = this;
            org.apache.commons.lang3.arch.Processor$Type r0 = org.apache.commons.lang3.arch.Processor.Type.IA_64
            org.apache.commons.lang3.arch.Processor$Type r1 = r2.type
            boolean r0 = r0.equals(r1)
            return r0
    }

    public boolean isPPC() {
            r2 = this;
            org.apache.commons.lang3.arch.Processor$Type r0 = org.apache.commons.lang3.arch.Processor.Type.PPC
            org.apache.commons.lang3.arch.Processor$Type r1 = r2.type
            boolean r0 = r0.equals(r1)
            return r0
    }

    public boolean isX86() {
            r2 = this;
            org.apache.commons.lang3.arch.Processor$Type r0 = org.apache.commons.lang3.arch.Processor.Type.X86
            org.apache.commons.lang3.arch.Processor$Type r1 = r2.type
            boolean r0 = r0.equals(r1)
            return r0
    }
}
