// ============================================================================
//   Copyright 2006, 2007, 2008 Daniel W. Dyer
//
//   Licensed under the Apache License, Version 2.0 (the "License");
//   you may not use this file except in compliance with the License.
//   You may obtain a copy of the License at
//
//       http://www.apache.org/licenses/LICENSE-2.0
//
//   Unless required by applicable law or agreed to in writing, software
//   distributed under the License is distributed on an "AS IS" BASIS,
//   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//   See the License for the specific language governing permissions and
//   limitations under the License.
// ============================================================================
package org.uncommons.watchmaker.examples.geneticprogramming;

/**
 * A program {@link Node} that evaluates to a one if the value of its first
 * argument is greater than the value of its second, or evaluates to zero otherwise. 
 * @author Daniel Dyer
 */
public class IsGreater extends BinaryNode
{
    /**
     * Creates a node that evaluates to one if the value of the first child node
     * is greater than the value of the second child node.  Otherwise it evaluates
     * to zero.
     * @param left The first operand.
     * @param right The second operand.
     */
    public IsGreater(Node left, Node right)
    {
        super(left, right, '>');
    }


    /**
     * Returns a value of one if the value of the first node is greater than the value of
     * the second node.  Returns a value of zero otherwise.
     * @param programParameters The parameters passed to this program (ignored by the
     * IsGreater node but may be used in the evaluation of child nodes).
     * @return One or zero depending on the relative values of the two child nodes.
     */
    public double evaluate(double[] programParameters)
    {
        return getLeft().evaluate(programParameters) > getRight().evaluate(programParameters) ? 1 : 0;
    }
}