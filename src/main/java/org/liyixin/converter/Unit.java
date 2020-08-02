package org.liyixin.converter;

/**
 * @author Liyixin
 */
public enum Unit implements InchConverter{
    Foot {
        @Override
        public double toInch(double unit) {
            return unit * 12;
        }

        @Override
        public double fromInch(double inch) {
            return inch / 12;
        }
    },
    Inch {
        @Override
        public double toInch(double unit) {
            return unit;
        }

        @Override
        public double fromInch(double inch) {
            return inch;
        }
    },
    Yard {
        @Override
        public double toInch(double unit) {
            return unit * 36;
        }

        @Override
        public double fromInch(double inch) {
            return inch / 36;
        }
    }
}
