# cerner_2^5_2019
# Displaying 3D Lorenz attractor plot in Julia with Plots.
using Plots

# define the Lorenz attractor
mutable struct Lorenz
    dt; σ; ρ; β; x; y; z
end

function step!(l::Lorenz)
    dx = l.σ*(l.y - l.x)       ; l.x += l.dt * dx
    dy = l.x*(l.ρ - l.z) - l.y ; l.y += l.dt * dy
    dz = l.x*l.y - l.β*l.z     ; l.z += l.dt * dz
end

attractor = Lorenz((dt = 0.02, σ = 10., ρ = 28., β = 8//3, x = 1., y = 1., z = 1.)...)

# initialize a 3D plot with 1 empty series
plt = plot3d(1, xlim=(-25,25), ylim=(-25,25), zlim=(0,50),
                title = "Lorenz Attractor", marker = 2)

# Perform Lorenz attractor step and display to GUI
for i = 1 : 1500
    step!(attractor)
    push!(plt, attractor.x, attractor.y, attractor.z)
    display(plt)
end

# Read a line to keep GUI from closing when Julia program is finished
readline()